
import java.util.*;
public class ReverseAnArray{
    public static void display(int[] a){
      StringBuilder sb = new StringBuilder();

        for(int val: a){
         sb.append(val + " ");
        }
       System.out.println(sb);
   }

  public static void reverse(int[] a){
    // write your code here

    int i = 0;
    int j = a.length-1;

    while(i < j){
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
      
      i++;
      j--;

    }
    
  }
    public static void main(String[] args) throws Exception {
     Scanner scn = new Scanner(System.in); 

        int n = scn.nextInt();

        int[] a = new int[n];
        for(int i = 0; i < n; i++){
         a[i] = scn.nextInt();
        }
    
        scn.close(); 

        reverse(a);
        display(a);
    }

}


/*
Input ------------->
5
1
2
3
4
5

Output ------------->
5 4 3 2 1

*/
