import java.util.*; 
  public class AnyBaseSubtraction{
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
      scn.close();
    }
  
    public static int getDifference(int b, int n1, int n2){
       // write your code here
      int ans = 0;
      int c = 0;
      int pow = 1;

      while(n2 > 0){

        int d1 = n1%10;
        int d2 = n2%10;

        n1 = n1/10;
        n2 = n2/10; 

        int d = 0;
        d2 = d2 + c;

        if(d2 >= d1){
           c = 0;
           d = d2-d1;
        }else{
           c = -1;
           d = d2 + b - d1;
        }

        ans = ans + d*pow;
        pow = pow * 10;

      } 
      return ans;

    }
  
  }

/*
Input ------------>
8    <- base
1212 n2
256  n1

Output ---------------->
734
*/
