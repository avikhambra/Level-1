
import java.util.*;
public class LastIndex {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int[] ak = new int[n];
        for(int i = 0; i<n; i++){
            ak[i] = scn.nextInt();
        }
        
        int d = scn.nextInt();
        int ans = lastIndex(ak , 0 , d);
        System.out.println(ans);

        scn.close();
    }

    public static int lastIndex(int[] ak, int idx, int x){
     
    if(idx == ak.length){
        return -1;
    }   
        
    int LastIsmallA = lastIndex(ak , idx+1, x);
    
        if(LastIsmallA == -1){
        
           if(ak[idx] == x){
             return idx;
           }else{
             return -1;
           }
        }else{
            return LastIsmallA;
        }
    }
}


/*
Input ---------->
6
15
11
40
4
4
9
4

Output --------->
4
*/
