// All Indices of Array

import java.util.*;
public class allIndices {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();

        int[] iarr = AL(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println("NO OUTPUT");
            //return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }

        scn.close();
    }

    public static int[] AL(int[] arr, int x, int idx, int fsf) {
        // write ur code here
        
        if(idx == arr.length){
          return new int[fsf];
        }

        int ans[]; 

        if(arr[idx] == x){
            ans = AL(arr , x , idx+1 , fsf+1);
            ans[fsf] = idx;
        }else{
            ans = AL(arr , x , idx+1 , fsf);
        }

        return ans;
    }

}

/*
Input ---------->
6
15   6756865675656659
11
40
4
4
9  
4

Output --------->
3
4

*/




     