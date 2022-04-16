// Power Logarithmic

import java.util.*;
public class PowerLogarithmic{
    public static void main(String[] args)throws Exception{
        Scanner scn = new Scanner(System.in);
        
        int x = scn.nextInt();
        int n = scn.nextInt();
        int plog = powL(x , n);  // (x) ki power (n)
        System.out.print(plog);

        scn.close();
    }
    public static int powL(int x , int n){
        
    if(n == 0){
        return 1;
    }    
        
    int xnm1 = powL(x , n/2);
    int ans = xnm1 * xnm1;
    
    if(n % 2 == 1){
        ans = ans * x;
    }
        return ans;
    }
}

/*
Input ------------>
2
5

Output ----------->
32

*/
