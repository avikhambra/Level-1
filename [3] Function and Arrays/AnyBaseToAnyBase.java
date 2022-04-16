import java.util.*;
  
  public class AnyBaseToAnyBase{
  
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int Base1 = scn.nextInt();
      int Base2 = scn.nextInt();

      int Ans1 = AnyBaseToDesimal(n , Base1);
      int Ans2 = DesimalToAnyBase(Ans1 , Base2);
      System.out.println(Ans2);

      scn.close();
    }

    public static int AnyBaseToDesimal(int n , int Base1){
      
      int ans = 0;
      
      int pow = 1;
      while(n > 0){
        int dig = n%10;
        n = n/10;

        ans = ans + dig * pow;
        pow = pow * Base1;
      }

      return ans;

    }

    public static int DesimalToAnyBase(int n , int Base2){

      int ans = 0;

      int pow = 1;
      while(n > 0){
        int dig = n%Base2;
        n = n/Base2;

        ans = ans + dig * pow;
        pow = pow*10;
         
      }
      return ans;

    }









  }

/*
Input ------------->


Output ------------->


*/