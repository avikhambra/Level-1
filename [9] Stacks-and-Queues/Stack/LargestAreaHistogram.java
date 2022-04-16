import java.io.*;
import java.util.*;
public class LargestAreaHistogram{
  
   public static void main(String[] args) throws Exception {  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];
      for(int i = 0; i < n; i++){
         arr[i] = Integer.parseInt(br.readLine());
      }

     // code
      int[] rb = new int[arr.length];//NextSmallElement index on the Right.

      Stack<Integer> st = new Stack<>();
      st.push(arr.length-1);
      rb[arr.length-1] = arr.length;
            //7-2=5 , 7-3=4 , 7-4=3 , 7-5=2 , 7-6=1 , 7-7=0
      for(int i=arr.length-2; i>=0; i--){
         while(st.size() > 0 && arr[i] <= arr[st.peek()]){
            st.pop();
         }

         if(st.size() == 0){
            rb[i] = arr.length;
         }else{
            rb[i] = st.peek();
         }

         st.push(i);
      }


      int[] lb = new int[arr.length];//NextSmallElement index on the Left.

      st = new Stack<>();
      st.push(0);
      lb[0] = -1;
              //2 3 4 5 6
      for(int i=1; i<arr.length; i++){
         while(st.size()>0 && arr[i] <= arr[st.peek()]){
            st.pop();
         }

         if(st.size() == 0){
            lb[i] = -1;
         }else{
            lb[i] = st.peek();
         }

         st.push(i);
      }

      int maxArea = 0;
         
      for(int i = 0; i<arr.length; i++){
       int width = rb[i] - lb[i]-1;
       int area = arr[i] * width;

         if(area > maxArea){
          maxArea = area;
         } 
      }

      System.out.println(maxArea);
   }
}

/*
Input -------------->
7
6
2
5
4
5
1
6

Output ------------>
12

*/
