import java.util.*;
  public class TwoDArraysDemo{
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    // write your code here  
    
    int n = scn.nextInt();
    int m = scn.nextInt();

    int[][]arr = new int [n][m];
    for(int i = 0;i <n; i++){
        for(int j = 0; j<m; j++){
          arr[i][j] = scn.nextInt();
        } 
    }

    for(int i = 0; i<arr.length; i++){
       
      for(int j = 0; j<arr[0].length; j++){
         System.out.print(arr[i][j] + " ");
      }
      System.out.println(); 
    }
    scn.close();

   }
}


/*
Input --------------->
2
4
11
12
13
14
21
22
23
24

Output ------------->
11 12 13 14
21 22 23 24

*/