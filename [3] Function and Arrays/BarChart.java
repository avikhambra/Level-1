
import java.util.*;

public class BarChart{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    // write your code here
    int n = scn.nextInt();

    int[] arr = new int[n];
    for(int i = 0; i<arr.length; i++){
       arr[i] = scn.nextInt();
    }

    int max = arr[0];
    for(int i = 1; i<arr.length; i++){
        if(arr[i] > max){
          max = arr[i];
        }
    }

    for(int floor = max; floor>=1; floor--){
        
        for(int i = 0; i<arr.length; i++){

            if(arr[i] >= floor){ 
              System.out.print("*\t");
            }else{
              System.out.print("\t");
            }

        }
        System.out.println();

    }
    scn.close();
 }

}


/*
Input ----------------->
5
3
1
0
7
5 

Output ----------------->
			*		
			*		
			*	*	
			*	*	
*			*	*	
*			*	*	
*	*		*	*	


*/
