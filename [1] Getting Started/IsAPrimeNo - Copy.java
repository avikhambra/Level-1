import java.util.*;
public class IsAPrimeNo{
    public static void main(String[] args)throws Exception{
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for(int i = 0; i<t; i++){
            int n = scn.nextInt();

            int count = 0;
            for(int div = 2; div*div<=n; div++){

                if(n%div == 0){
                  count++;
                  break;
                }
            }
            
            if(count == 0){
               System.out.println("prime");
            }else{
                System.out.println("not prime");
            } 
        }
        scn.close();
    }
}


/*
Input ------------------>
5
13
2
3
4
5

Output --------------------->
prime
prime
prime
not prime
prime
*/
