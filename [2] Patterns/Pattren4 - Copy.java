import java.util.*;

public class Pattren4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // write ur code here

        int st = n;
        int sp = 0;
        
        for(int i = 1; i<=n; i++){

            for(int j = 1; j<=sp; j++){
               System.out.print("\t");
            }
          
            for(int j = 1; j<=st; j++){
               System.out.print("*\t");
            }

            sp++;
            st--;
            System.out.println();

        }
        scn.close();

    }
}


/* 
Input ----------->
5

Output -----------.
*	*	*	*	*	
	*	*	*	*	
		*	*	*	
			*	*	
				*	
*/
