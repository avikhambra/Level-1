
import java.util.*;

public class ExitPointOfAMatrix{

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        // write your code here
    
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
              arr[i][j] = scn.nextInt();
            }
        }

        int i = 0;
        int j = 0;
        int d = 0;

        while(true){
           
           d = (d + arr[i][j]) % 4;

            if(d == 0){
               j++;//East
            }else if(d == 1){
               i++;//south
            }else if(d == 2){
               j--; 
            }else if(d == 3){
               i--; 
            }
               
            if(i < 0){
              i++;
              break;
            }else if(j < 0){
              j++;
              break;
            }else if(i == arr.length){
              i--;
              break;
            }else if(j == arr[0].length){
              j--;
              break; 
            }

        }
        scn.close();

        System.out.println(i);
        System.out.println(j);

    }

}


/*
Input ---------------->
Sample Input

4
4
0
0
1
0
1
0
0
0
0
0
0
0
1
0
1
0

Output ---------------->
1
3

*/
