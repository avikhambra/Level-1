import java.util.*;
public class TowerOfHanoi{
 
    public static void main(String[] args) throws Exception{
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int t1 = scn.nextInt();
    int t2 = scn.nextInt();
    int t3 = scn.nextInt();
    toh(n, t1, t2, t3);

    scn.close();
  }
    
  public static void toh(int n, int t1, int t2, int t3){
    if (n == 0){
      return;
    }  
    
    toh(n - 1, t1, t3, t2);
    System.out.println(n + "[" + t1 + " -> " + t2 + "]");
    toh(n - 1, t3, t2, t1);
  }
}

/*
Input ----------->
3
10
11
12

Output ------------>
1[10 -> 11]
2[10 -> 12]
1[11 -> 12]
3[10 -> 11]
1[12 -> 10]
2[12 -> 11]
1[10 -> 11]

*/
