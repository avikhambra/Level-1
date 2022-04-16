
import java.util.*;

public class MatrixMultiplication{

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);

    // one matrix
    int r1 = scn.nextInt();
    int c1 = scn.nextInt();
    
    int[][] one = new int[r1][c1];
    for(int i = 0; i<one.length; i++){
        for(int j = 0; j<one[0].length; j++){
           one[i][j] = scn.nextInt();
        }
    }
    
    // two matrix
    int r2 = scn.nextInt();
    int c2 = scn.nextInt();
    
    int[][] two = new int[r2][c2];
    for(int i = 0; i<two.length; i++){
        for(int j = 0; j<two[0].length; j++){
          two[i][j] = scn.nextInt();
        }
    }
     
    scn.close();

    if(c1 != r2){
      System.out.print("Invalid input");
      return;
    }

    int[][] ans = new int[r1][c2]; // ans matrix

    for(int i = 0; i<ans.length; i++){
        
        for(int j = 0; j<ans[0].length; j++){

          int val = 0;
          for(int k = 0; k<r2; k++){
            val = val + one[i][k] * two[k][j];
          }
           ans[i][j] = val;
        } 

    }

     for(int i = 0; i<ans.length; i++){
        for(int j = 0; j<ans[0].length; j++){
           System.out.print(ans[i][j] + " ");
        }
        System.out.println();
    }
     

  }

}

/*
Input ---------------->

2
3
10
0
0
0
20
0
3
4
1
0
1
0
0
1
1
2
1
1
0
0

Output -------------->
10 0 10 0
0 20 20 40


*/



