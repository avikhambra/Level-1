import java.util.*;
  
  public class PrintFibonacciNoTillN{
  
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();

      scn.close();

      int a = 0;
      int b = 1;

      for(int i = 0; i<n; i++){

          System.out.println(a);
          int c = a+b;
          a = b;
          b = c;
        } 
      }

    
  }
