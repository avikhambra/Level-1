
import java.util.*;
public class Factorial{
    public static void main(String[] args)throws Exception{
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int ans = f(n);
        System.out.println(ans);

        scn.close();
    }
    public static int f(int n){
        
    if(n  == 1){
        return 1;
    }
    
    int fnm1 = f(n-1);
    int fact = n * fnm1;
    return fact;
      
    }
}

/*
Input -------------->
5

Output ------------->
120


*/