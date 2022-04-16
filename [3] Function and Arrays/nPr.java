
import java.util.*;
public class nPr{
    public static int fact(int x){ // Factorial nikalne k liye. !
       
        int ReturnVlaue = 1;
        for(int i = 1; i<=x; i++){
          ReturnVlaue = ReturnVlaue*i;
        }
        return ReturnVlaue;
    }
    public static void main(String[] args)throws Exception{
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int r = scn.nextInt();

        int nf = fact(n); // n! factorial
      
        int nmrf = fact(n-r);// (n - r)! factorial
      
        int nPr = nf / nmrf; // nPr = n! / (n-r)! 

        System.out.println(n + "P" + r + " = " + nPr);
        scn.close();
    }
}