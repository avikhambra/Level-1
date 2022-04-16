// The State Of Wakanda - 2  or Diagonal Traversal 

import java.util.*;
public class DiagonalTraversal1 {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        // write your code here
        int n = scn.nextInt();
        
        int[][] arr = new int[n][n];
        for(int i = 0; i<arr.length; i++){
           for(int j = 0; j<arr[0].length; j++){
              arr[i][j] = scn.nextInt();
           }
        }
        
        for(int gap = 0; gap<arr.length; gap++){// 3

            for(int i = 0, j = gap; j<arr.length; i++, j++){
               System.out.println(arr[i][j]);
            }

        }
        scn.close();
    }

}


/*
Input --------------->
4
11
12
13
14
21
22
23
24
31
32
33
34
41
42
43
44

Output -------------->
11
22
33
44
12
23
34
13
24
14



*/

