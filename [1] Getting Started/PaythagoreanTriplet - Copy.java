import java.util.*;
  
public class PaythagoreanTriplet {
  
  	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
  	  	//   Write your code here

        int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();

		int max = a;

		if(b > max){
          max = b;
		}

		if(c > max){
          max = c;
		}

		if(a == max){
           boolean flag = ( (a*a) == (b*b) + (c*c) );
		   System.out.println(flag);
		}else if(b == max){
           boolean flag = ( (b*b) == (a*a) + (c*c) );
		   System.out.println(flag);
		}else {
           boolean flag = ( (c*c) == (b*b) + (a*a) );
		   System.out.println(flag);
		} 

        scn.close();

  	}
}
