
import java.util.*;
public class SubArrayProblem{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
     // write your code here

    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i<arr.length; i++){
       arr[i] = scn.nextInt();
    }

    for(int i = 0; i<arr.length; i++){

        for(int j = i; j<arr.length; j++){
           
            for(int k = i; k <= j; k++){
               System.out.print(arr[k] + "\t");
            }
            System.out.println();
        }

        scn.close();

    }
  
 }

}

/* 
Input ------------->
3
10
20
30

Output -------------->
10	
10	20	
10	20	30	
20	
20	30	
30	


*/
