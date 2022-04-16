
import java.util.*;

public class InverseOfAnArray{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

  public static int[] inverse(int[] a){
    // write your code here
    int[] inv = new int[a.length];
    
    for(int i = 0; i<a.length; i++){
      int v = a[i];
      inv[v] = i; 
    }

    return inv;
  }

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = scn.nextInt();
    }
    
    scn.close();

    int[] inv = inverse(a);
    display(inv);
 }

}
/*
Input ---------->
5
4
0
2
3
1

Output ---------->
1
4
2
3
0

*/
