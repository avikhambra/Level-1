import java.util.*;
  
  public class CountDigitsInANo{
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();//555
     
    scn.close();

    int dig = 0;

    for( ; n != 0; ){
        n = n/10;
        dig++;
    }
    System.out.println(dig);  
   }

   
}
