
import java.util.*;
public class SaddlePrice {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        // write your code here
        int n = scn.nextInt();

        int[][]arr = new int [n][n];
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
              arr[i][j] = scn.nextInt();
            }
        }
        scn.close(); 
        

        for(int i = 0; i<arr.length; i++){
             
            int SVJ = 0; // Small Value in j 
            for(int j = 0; j<arr[0].length; j++){
                if(arr[i][j] < arr[i][SVJ]){
                    SVJ = j;
                }
            }

            boolean flag = true;
            for(int k = 0; k<arr.length; k++){
                if(arr[k][SVJ] > arr[i][SVJ]){
                    flag = false;
                    break;
                }
            }

            if(flag == true){
              System.out.println(arr[i][SVJ]);
              return;
            }

        } 

        System.out.println("Invalid input");

    }

} 

/*
Input ------------>
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

Output ----------->
41

*/
