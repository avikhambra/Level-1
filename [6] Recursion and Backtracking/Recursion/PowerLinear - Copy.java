
import java.util.*;
public class PowerLinear{
    public static void main(String[] args)throws Exception{
        Scanner scn = new Scanner(System.in);
        
        int x = scn.nextInt();
        int n = scn.nextInt();
        int ans = powL(x,n);
        System.out.println(ans);

        scn.close();
    }
    public static int powL(int x, int n){
     
    if(n == 0){
        return 1;
    }    
        
    int nm1 = powL(x,n-1);
    int xn = x * nm1;
    return xn;
        
    }
}

/*
Input ------------->
2
5

Output ------------>
32

*/
