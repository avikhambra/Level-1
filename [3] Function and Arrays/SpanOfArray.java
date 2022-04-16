
import java.util.*;

public class SpanOfArray{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    // write your code here

    int n = scn.nextInt();

    int[] arr = new int[n];
    for(int i = 0; i<arr.length; i++){
      arr[i] = scn.nextInt();
    }

    int max = arr[0];
    int min = arr[0];

    for(int i = 1; i<arr.length; i++){
       
        if(arr[i] > max){
           max = arr[i];
        }

        if(arr[i] < min){
          min = arr[i];
        }

    }

    scn.close();

    int span = max - min;
    System.out.println(span);

   
 }

}

/*
Input ---------------->
6
15
30
40
4
11
9

Output -------------->
36

*/
