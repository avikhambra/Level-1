import java.util.*;
  public class TheCuriousCaseOfBenjaminBulbs { 
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);

            int n = scn.nextInt();
            scn.close();
            
            for(int i = 1; i * i <= n; i++){
                System.out.println(i * i); //ON
            }
    }
}

/*
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
       
        int n = scn.nextInt();

        for(int i = 1; i<=n; i++){
             
            int sr = (int)Math.sqrt(i);

            if(sr*sr != i){
                System.out.println(i); // OFF
            }
  
        }

    }

*/


