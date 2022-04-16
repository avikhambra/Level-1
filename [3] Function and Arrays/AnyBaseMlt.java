import java.util.*;

public class AnyBaseMlt{
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);

    scn.close();
 }

    public static int getProduct(int b, int n1, int n2){
     // write your code here
     int ans = 0;
     int pow = 1;
     
      while(n2 > 0){
        int d2 = n2%10;//3
        n2 = n2/10;//2

        int SingleDigitMlt = SDM(b , n1 , d2);  

        ans = getSum(b , ans , SingleDigitMlt*pow);
        pow = pow*10;

      }
      return ans;
    

    }

    public static int SDM(int b , int n1 , int n2){
      
      int ans = 0;
      int c = 0;
      int pow = 1;

      while(n1 > 0 || c > 0){
        
        int d1 = n1%10;
        n1 = n1/10;

        int d = 0;
        d = d1*n2+c; 
        
        c = d/b;
        d = d%b;
        
        ans = ans + d*pow;
        pow = pow*10;

      }
      return ans;
       
    }

    public static int getSum(int b , int n1 , int n2){
      
      int ans = 0;
      int c = 0;
      int pow = 1;

      while(n1 > 0 || n2 > 0 || c > 0){

         int no1 = n1%10;
         int no2 = n2%10;

         n1 = n1/10;
         n2 = n2/10;

         int d = 0;
         d = no1+no2+c;

         c = d/b;
         d = d%b;

         ans = ans + d * pow;
         pow = pow * 10;

      } 
      return ans; 

    }

 }

 /*
Input ------------->
10    base
2156  n1
74    n2

Output ------------>
159544
 */

