import java.util.*;

public class Pattren15 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        // write ur code here
        
        int ST = 1;
        int SP = n/2;
        int val = 1;

        for(int i = 1; i<=n; i++){
           
            for(int j = 1; j<=SP; j++){
              System.out.print("\t");
            }

            int Cval = val; 
            for(int j = 1; j<=ST; j++){
              System.out.print(Cval + "\t");

              if(j <= ST/2){
                Cval++;
              }else{
                Cval--;  
              }
              
            }

            if(i <= n/2){
               SP--;
               ST = ST+2;
               val++;
            }else{
               SP++;
               ST = ST-2;
               val--;
            }
           

            System.out.println();

        }
        scn.close();  
    }
}

/*
Input ----------->
5

Output ---------------->
		1	
	2	3	2	
3	4	5	4	3	
	2	3	2	
		1	

*/
