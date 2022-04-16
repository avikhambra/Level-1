
import java.util.*;

public class SumOf2Array{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    // write your code here
    
    int n1 = scn.nextInt();
    int[] arr1 = new int[n1];
    for(int i = 0; i<n1; i++){
      arr1[i] = scn.nextInt();
    } 

    int n2 = scn.nextInt();
    int[] arr2 = new int[n2];
    for(int i = 0; i<n2; i++){
      arr2[i] = scn.nextInt();
    }
    
    int[] sum = new int[n1 > n2 ? n1 : n2];
    
    int c = 0;
    int i = arr1.length-1;
    int j = arr2.length-1;
    int k = sum.length-1;

    while(k >= 0){
      
        int d = c;

        if(i >= 0){
          d = d + arr1[i];
        }

        if(j >= 0){
          d = d + arr2[j]; 
        }

        c = d/10;
        d = d%10;

        sum[k] = d;

        i--;
        j--;
        k--;
        
    }

    if(c > 0){
       System.out.println(c);
    }

    for(int val : sum){
       System.out.println(val);
    }

    scn.close();
    
 }

}

/*
Input ------------->
5    arr1
3
1
0
7
5
6    arr2
1
1
1
1
1
1

Output -------------->
1
4
2
1
8
6


*/
