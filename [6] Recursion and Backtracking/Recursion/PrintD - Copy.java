
import java.util.*;
public class PrintD{
    public static void main(String[] args)throws Exception{
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        pD(n);

        scn.close();
    }
    public static void pD(int n){
        
        if( n == 0 ){
            return;
        }
        
        System.out.println(n);
        pD(n-1);
        
    }
}

/*
Input ----------->
5

Output ----------->
5
4
3
2
1

*/