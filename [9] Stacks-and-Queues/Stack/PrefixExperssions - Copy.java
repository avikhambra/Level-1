// Prefix Evaluation And Conversions

import java.io.*;
import java.util.*;

public class PrefixExperssions{
  
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        // code
        Stack<Integer> val = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<String> pre = new Stack<>();
 
        for(int i = exp.length()-1 ; i>=0; i--){
           char ch = exp.charAt(i);

            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
              int v1 = val.pop(); 
              int v2 = val.pop();
              int call = operation(v1 , v2 , ch);
              val.push(call);

              String iv1 = infix.pop();
              String iv2 = infix.pop();
              String ival = "(" + iv1 + ch + iv2 + ")";
              infix.push(ival);

              String pv1 = pre.pop();
              String pv2 = pre.pop();
              String pval = pv1 + pv2 + ch; 
              pre.push(pval);

            }else{
              val.push(ch - '0');
              infix.push(ch + "");
              pre.push(ch + "");  
            }
        } 

        System.out.println(val.pop());
        System.out.println(infix.pop());
        System.out.println(pre.pop());
    }

    public static int operation(int v1 , int v2 , char op){
        if(op == '+'){
            return v1+v2;
        }else if(op == '-'){
            return v1-v2;
        }else if(op == '*'){
            return v1*v2;
        }else{
            return v1/v2;
        }
    }
}

/*
Input ------>
-+2/*6483

Output --------------->
2
((2+((6*4)/8))-3)
264*8/+3-

*/
