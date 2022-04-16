
import java.util.*;
public class SpiralDisplay {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        // write your code here
        int r = scn.nextInt();
        int c = scn.nextInt();

        int[][] arr = new int[r][c];
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
              arr[i][j] = scn.nextInt();
            }
        }

        int minR = 0;
        int minC = 0;
        int maxR = arr.length-1;
        int maxC = arr[0].length-1;

        int total = r*c;
        int count = 0;

        while(count < total){
            
            // left
            for(int i = minR, j = minC;  i<=maxR && count<total; i++){
               System.out.println(arr[i][j]);
               count++;
            }
            minC++;         
 
            // bottom
            for(int j = minC , i = maxR; j<=maxC && count<total; j++){
               System.out.println(arr[i][j]);
               count++;
            } 
            maxR--;

            // right 
            for(int i = maxR, j = maxC; i>=minR && count<total; i--){
               System.out.println(arr[i][j]);
               count++;
            }
            maxC--;

           // top
            for(int j = maxC, i = minR; j>=minC && count<total; j--){
               System.out.println(arr[i][j]);
               count++;
            }
            minR++; 

        }
        scn.close();

    }

}

/*
Input -------------->
3
5
11
12
13
14
15
21
22
23
24
25
31
32
33
34
35


Output ------------->
11
21
31
32
33
34
35
25
15
14
13
12
22
23
24


*/
