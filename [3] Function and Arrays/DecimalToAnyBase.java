import java.util.*;
  
  public class DecimalToAnyBase{
  
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);

      scn.close();

    }
  
    public static int getValueInBase(int n, int b){
       // write code here
      
      int ans = 0;
      int pow = 1;

      while(n > 0){
        int dig = n%b;
        n = n/b;

        ans = ans + dig * pow;
        pow = pow*10;

      }
      return ans;
    }

}

/*
Input ------------->
117
8

Output ------------>
165


*/