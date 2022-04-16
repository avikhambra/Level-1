
import java.util.*;

public class DisplayArray {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int[]A1 = new int[n];
        for(int i = 0; i<n; i++){
        A1[i] = scn.nextInt();
        }
        
       displayArr(A1 , 0);

       scn.close();
    }

    public static void displayArr(int[]A1, int idx){
      
      
      if(idx == A1.length){
          return;
        }
      
       System.out.println(A1[idx]);
    
       displayArr(A1, idx+1);
      
    }
}

/*
Input --------->
5
3
1
0
7
5


Output ---------->
3
1
0
7
5
*/
