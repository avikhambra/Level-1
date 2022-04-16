// Next Greater Element on the right.

import java.io.*;
import java.util.*;

public class NGEOTR{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] nge = solve(a);
    display(nge);
 }

    public static int[] solve(int[] arr){
        // solve
       int[] nge = new int[arr.length];

       Stack<Integer> st = new Stack<>();

       st.push(arr[arr.length - 1]);
       nge[arr.length-1] = -1;

        for(int i = arr.length-2; i>=0; i--){
    
           while(st.size() > 0 && arr[i] >= st.peek()){
           st.pop();
           }

            if(st.size() == 0){
              nge[i] = -1;
            }else{
              nge[i] = st.peek();
            }

            st.push(arr[i]);

        }
         return nge;

    }

}

/*
// Input ---------->
5
5
3
8
-2
7

Output ------------------>
8
8
-1
7
-1

*/

// ------------------------------------------------------------||

/*

// class Solution {
//     public int[] NSOR(int[] arr) {
//         int n = arr.length;
//         LinkedList<Integer> st = new LinkedList<>();
//         int[] ans = new int[n];
//         Arrays.fill(ans, n); 

//         for(int i = 0; i < n; i++){
//             while(st.size() != 0 && arr[st.getFirst()] > arr[i]){  
//                 ans[st.getFirst()] = i;   
//                 st.removeFirst();  
//             }
//             st.addFirst(i);
//         }
//         return ans;

//     }
//     public int[] NSOL(int[] arr) {
//         int n = arr.length;
//         LinkedList<Integer> st = new LinkedList<>();
//         int[] ans = new int[n];
//         Arrays.fill(ans, -1);  

//         for(int i = n - 1; i >= 0; i--){   
//             while(st.size() != 0 && arr[st.getFirst()] > arr[i]){  
//                 ans[st.getFirst()] = i;   
//                 st.removeFirst();   
//             }
//             st.addFirst(i);  
//         }
//         return ans;
//     }
//     public int largestRectangleArea(int[] heights) {
//         int[] r = NSOR(heights);
//         int[] l = NSOL(heights);
//         int area = 0;
//         for(int i = 0; i < heights.length; i++){
//             if(l[i] == -1 && r[i] == r.length){
//                 area = Math.max(area, heights.length * heights[i]);
//             }else{
//                 area = Math.max(area, (r[i] - l[i] - 1) * heights[i]);
//             }
//         }
//         return area;
//     }
// }






*/
