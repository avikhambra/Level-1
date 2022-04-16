import java.util.*;
    
  public class GCDorLCM{
    
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();

      int o1 = n1;
      int o2 = n2;

      while(n1%n2 != 0){
        int rem = n1%n2;
        n1 = n2;
        n2 = rem;
      }

      int GCD = n2;
      int LCM = (o1*o2)/GCD;

      System.out.println(GCD);
      System.out.println(LCM);

      scn.close();

    }
  }  