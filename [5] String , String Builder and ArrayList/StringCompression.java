
import java.util.*;
public class StringCompression {
	public static String compression1(String str){
		// write your code here

	    String ans = str.charAt(0)+"";

        for(int i = 1; i<str.length(); i++){
            char curent = str.charAt(i);
            char prv = str.charAt(i-1); 
			if(curent != prv){
               ans = ans + curent;
			}
		}

		return ans;
	}

	public static String compression2(String str){
		// write your code here
        String ans = str.charAt(0)+"";
		int count = 0;

		for(int i = 1; i<str.length(); i++){
            char curent = str.charAt(i);
			char prv = str.charAt(i-1);

            if(curent == prv){
                count++;
			}else{

				if(count > 1){
				  ans = ans + count;
				  count = 1;
				}
                ans = ans + curent;
			}

		}

        if(count > 1){
          ans = ans + count;
		  count = 0;  
		}

		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		 System.out.println(compression1(str));
		System.out.println(compression2(str));

		scn.close();
	}

}

/*
Input ------------>
wwwwaaadexxxxxx

Output ------------>
wadex
w4a3dex6

*/
