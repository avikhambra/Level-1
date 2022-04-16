// String With Difference Of Every Two Consecutive Characters


import java.util.*;
public class Difference{
	public static String solution(String str){
		// write your code here
      StringBuilder a = new StringBuilder();

	  a.append(str.charAt(0));// 

	    for(int i = 1; i<str.length(); i++){
           char cur = str.charAt(i);
		   char prv = str.charAt(i-1);

		   int diff = cur - prv;
           
		   a.append(diff);
		   a.append(cur);
	    }
        
		return a.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));

        scn.close();
	}

}

/*
Input ------------>
pepCODinG

Output ------------>
p-11e11p-45C12O-11D37i5n-39G

*/
