
import java.util.*;
public class ToggleCase {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(TC(str));

        scn.close();
	}

    public static String TC(String str){

        StringBuilder SB = new StringBuilder(str);
		// Humne str ko change kerna h is liye StringBuilder ka use kiya h.
       
        for(int i = 0; i<SB.length(); i++){
           char ch = SB.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
              char STB =  (char)('A' + ch - 'a'); // Small To Big
			  SB.setCharAt(i , STB);
		    }else if(ch >= 'A' && ch <= 'Z'){
              char BTS =  (char)('a' + ch - 'A'); // Big To Small
			  SB.setCharAt(i , BTS);
		    }
            
		}
        return SB.toString();// Ise SB firse String bn jayega or return kerdega.
	}

}


/*
Input ---------->
pepCODinG

Output ---------->
PEPcodINg

*/
