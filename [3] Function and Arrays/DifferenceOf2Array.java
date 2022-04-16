
import java.util.*;

public class DifferenceOf2Array{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    // write your code here

    int n1 = scn.nextInt();
    int[] a1 = new int[n1];
    for(int i = 0; i<a1.length; i++){
       a1[i] = scn.nextInt();
    }

    int n2 = scn.nextInt();
    int[] a2 = new int[n2];
    for(int i = 0; i<a2.length; i++){
       a2[i] = scn.nextInt();
    }

    int[] diff = new int[n2];
    
    int i = a1.length-1;
    int j = a2.length-1;
    int k = diff.length-1;
    int c = 0;

    while(k >= 0){
      
      int d = 0;
      int a1Val = i >= 0 ? a1[i] : 0; 

        if(a2[j] + c >= a1Val){
          d = a2[j] + c - a1Val;
          c = 0;
        }else{
          d = a2[j] + c + 10 - a1Val;
          c = -1; 
        }

        diff[k] = d;
        
        i--;
        j--;
        k--;

    }

    int idx = 0;
    while(idx < diff.length){

        if(diff[idx] == 0){
          idx++;
        }else{
          break;
        }

    }

    for(int p = idx; p<diff.length; p++){
       System.out.println(diff[p]);
    } 
    
    scn.close();

 }

}

/*
Input ----------->
3
2
6
7
4
1
0
0
0

Output ------------>
7
3
3



*/
