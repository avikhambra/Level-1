import java.util.*;
  
  public class AnyBaseToDecimal{
  
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);

      scn.close();
    }
  
    public static int getValueIndecimal(int n, int b){
      // write your code here

      int ans = 0;

      int pow = 1; 
      while(n > 0){
        int dig = n%10;
        n = n / 10;
        
        ans = ans + dig * pow;
        pow = pow*b;

      }
      return ans; 

    }
}

/*
Input -------------->
1172
8

Output ------------->
634

*/