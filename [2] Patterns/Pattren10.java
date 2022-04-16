import java.util.*;

public class Pattren10{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    // write ur code here
    int OS = n/2;// Outer Space
    int IS = -1; // Inner Space
    
    for(int i = 1; i<=n; i++){
      
        for(int j = 1; j<=OS; j++){
          System.out.print("\t");  
        }
        System.out.print("*\t");
        
        for(int j = 1; j<=IS; j++){
          System.out.print("\t");
        }

        if(i > 1 && i < n){
          System.out.print("*\t");
        }

        if(i <= n/2){
          OS--;
          IS = IS + 2;
        }else{
          OS++;
          IS = IS-2;
        }

        System.out.println();

    }
    scn.close();

 }
}

/*
Input -------->
5

Output ------------>
		*	
	*		*	
*				*	
	*		*	
		*	

*/
