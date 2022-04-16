import java.util.*;

public class InverseOfANo{

public static void main(String[] args) {
  Scanner scn = new Scanner(System.in);
  // write your code here 
  int n = scn.nextInt();
  int inverse = 0;
  int oPlace = 1;

  while(n != 0){
   int oDigit = n%10;
   int Idigit = oPlace;
   int Iplace = oDigit;

   inverse = inverse + Idigit*(int)Math.pow(10 , Iplace-1);
   n = n/10;
   oPlace++; 
  }
  System.out.println(inverse);
  scn.close();
 }
}