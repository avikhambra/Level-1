
// Node With Maximum Subtree Sum

import java.io.*;
import java.util.*;

public class NWithMSTsum {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static void display(Node node) {
    String str = node.data + " -> ";
    for (Node child : node.children) {
      str += child.data + ", ";
    }
    str += ".";
    System.out.println(str);

    for (Node child : node.children) {
      display(child);
    }
  }

  public static Node construct(int[] arr) {
    Node root = null;

    Stack<Node> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        st.pop();
      } else {
        Node t = new Node();
        t.data = arr[i];

        if (st.size() > 0) {
          st.peek().children.add(t);
        } else {
          root = t;
        }

        st.push(t);
      }
    }

    return root;
  }

  static int MaxNode = 0;
  static int MaxSum = Integer.MIN_VALUE;

  public static int Ans(Node node){
    int sum = 0;
    
    for(Node val : node.children){
      int Csum = Ans(val);
      sum = sum + Csum;
    }

    sum = sum + node.data;
     
    if(sum > MaxSum){
      MaxNode = node.data;
      MaxSum = sum;
    }

    return sum;
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    Node root = construct(arr);
    // write your code here
    Ans(root);
    System.out.println(MaxNode + "@" + MaxSum);
    
  }

}

/*
Input --------->
20
10 20 -50 -1 60 -1 -1 30 -70 -1 80 -1 90 -1 -1 40 -100 -1 -1 -1

Output ----------->
30@130

*/