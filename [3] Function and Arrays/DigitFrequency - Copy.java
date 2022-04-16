import java.util.*;

public class DigitFrequency {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);

        scn.close();
    }

    public static int getDigitFrequency(int n, int d) {
        // write code here
        int count = 0; 
        while(n != 0){
           int dig = n % 10;
           n = n/10;

           if(dig == d){
              count++;
           }

        } 
        return count;

    }
}

/*
Input ------------------->
994543234
 4

Output ----------->
3
*/
