
import java.util.*;

public class PrintI {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        // write your code here
        int n = scn.nextInt();
        printIncreasing(n);

        scn.close();
    }

    public static void printIncreasing(int n){
        
        if(n == 0){
           return;
        }

        printIncreasing(n-1);
        System.out.println(n);

    }

}

/*
Input ---------->
5

Output ---------->
1
2
3
4
5


*/
