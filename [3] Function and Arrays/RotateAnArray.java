
import java.util.*;

public class RotateAnArray{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }
  
  public static void reverse(int[] a , int i , int j){
    
    int left = i;
    int right = j;

    while(left < right){
      int temp = a[left];
      a[left] = a[right];
      a[right] = temp;

      left++;
      right--; 
    }

  }

  public static void rotate(int[] a, int k){
    // write your code here

    k = k % a.length;
    if(k < 0){
      k = k + a.length; 
    }

    // Part - 1
    reverse(a , 0 , a.length-k-1);

    // Part - 2
    reverse(a , a.length-k , a.length-1);

    // Part - 3
    reverse(a , 0 , a.length-1);
     
  }

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = scn.nextInt();
    }
    int k = scn.nextInt();

    scn.close();

    rotate(a, k);
    display(a);
 }

} 

/*
Input -------------->
5
1
2
3
4
5
3

Output --------------->
3 4 5 1 2

*/
