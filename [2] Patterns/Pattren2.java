import java.util.*;

public class Pattren2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // write ur code here

        for(int i = n; i>=1; i--){

            for(int j = 1; j<=i; j++){
              System.out.print("*\t");
            }
            System.out.println();

        }  
        scn.close();  

    }
}


/* 
Input ----------->
5

Output ------------>
*	*	*	*	*	
*	*	*	*	
*	*	*	
*	*	
*
*/
