
import java.util.*;
public class PrintDI{
    public static void main(String[] args)throws Exception{
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        pDI(n);

        scn.close();
    }
    public static void pDI(int n){
     
    if( n == 0){
        return;
    } 
     
    System.out.println(n);   
    pDI(n-1);
    System.out.println(n);
    
    }
}

/*
Input ------------>
3

Output ----------->
3
2
1
1
2
3

*/