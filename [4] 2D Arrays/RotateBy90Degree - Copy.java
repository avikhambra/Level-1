
import java.util.*;
public class RotateBy90Degree {
  public static void main(String[] args)throws Exception{
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();

    int[][]arr = new int[n][n];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        arr[i][j] = scn.nextInt();
      }
    }
    rotateBy90(arr);
    display(arr);

    scn.close();

  }

  public static void rotateBy90(int arr[][]) {
    // Transpose---->

    for (int i = 0; i < arr.length; i++) {

      for (int j = 0; j < i; j++) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
      }
    }

    // Reverse Colums ,Row by Row---->

    for (int i = 0; i < arr.length; i++) {

      int L = 0;                 // Left
      int R = arr[0].length - 1; // Right
      while (L <= R) {
        int temp = arr[i][L];
        arr[i][L] = arr[i][R];
        arr[i][R] = temp;

        L++;
        R--;
      }
    }
 
  }

  public static void display(int[][] arr) {

    for (int i = 0; i < arr.length; i++) {

      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
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

Output --------------->
41 31 21 11
42 32 22 12
43 33 23 13
44 34 24 14

*/
