import java.util.*;
public class Pattren9 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // write ur code here

        for(int i = 1; i<=n; i++){
          
            for(int j = 1; j<=n; j++){
               
              if(i == j || i+j == n+1){
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
Input ---------->
5

Output ------------->
*				*	
	*		*		
		*			
	*		*		
*				*	

*/
