import java.util.*;

public class Pattren11 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        // write ur code here
        int val = 1;
        for(int i = 1; i<=n; i++){
          
            for(int j = 1; j<=i; j++){
              System.out.print(val + "\t");
              val++;
            }
            System.out.println(); 
        }
        scn.close();
    }
}

/*
Input --------->
5

Output --------------->
1	
2	3	
4	5	6	
7	8	9	10	
11	12	13	14	15	

*/