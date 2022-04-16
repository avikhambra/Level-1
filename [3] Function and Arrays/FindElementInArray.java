
import java.util.*;
public class FindElementInArray{
    public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      // write your code here

        int n = scn.nextInt();
       
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
         arr[i] = scn.nextInt();
        } 
        
        int d = scn.nextInt();
        int flag = 0;
        for(int i = 0; i<arr.length; i++){
          
            if(arr[i] == d){
              flag = 1;
              System.out.println(i);
              break;
            }

        }

        if(flag == 0){
          System.out.println(-1);
        }

        scn.close();

    }

}


/*
Input-------------->
6
15
30
40
4
11
9
40    <-- find

Output --------------->
2     <-- index

*/
