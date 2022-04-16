
import java.util.*;
public class ZigZag {
    
    public static void main(String[] args) throws Exception {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();  // 3
       pzz(n);

       scn.close();
    }
    
    public static void pzz(int n){
        
        if(n == 0){
            return ;
        }
        
        System.out.print(n + " ");   // 1 (Line) 
        pzz(n-1);                    // 2
        System.out.print(n + " ");   // 3
        pzz(n-1);                    // 4
        System.out.print(n + " ");   // 5
        
    }
}

/*
Input ----------->
3

Output ---------->
3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3

*/
