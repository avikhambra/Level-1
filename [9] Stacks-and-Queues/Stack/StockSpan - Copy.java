import java.io.*;
import java.util.*;

public class StockSpan{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] span = solve(a);
    display(span);
 }

 public static int[] solve(int[] arr){
   // solve
  int[] span = new int[arr.length];

  Stack<Integer> st = new Stack<>();
  st.push(0);
  span[0] = 1;

  for(int i = 1; i<arr.length; i++){
    while(st.size() > 0 && arr[i] > arr[st.peek()]){
      st.pop();
    }

    if(st.size() == 0){
      span[i] = i+1;
    }else{
      span[i] = i - st.peek();
    }

    st.push(i);
  } 
  
   return span;
 }
}

/*
Input ----------------->
12
1
2
4
1
5
3
2
4
1
3
1
2

Output ---------------->
1
2
3
1
5
1
1
3
1
2
1
2




*/
