
import java.util.*;

public class FirstIndex{

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        // write your code here

        int n = scn.nextInt();
        
        int[]arr = new int[n];
        for(int i = 0; i<arr.length; i++){
           arr[i] = scn.nextInt(); 
        }
        
        int x = scn.nextInt();

        int ans = firstIndex(arr , 0 , x);
        System.out.println(ans);

        scn.close();
    }

    public static int firstIndex(int[] arr, int idx, int x){
     
        if(idx == arr.length){
          return -1;
        }
        
        if(arr[idx] == x){
           return idx; 
        }else{
            int FISA = firstIndex(arr , idx+1 , x); //First Index Small Array
            return FISA;                                     
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

Output ----------->
3

*/
