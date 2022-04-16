// Size, Sum, Maximum And Height Of A Binary Tree

import java.io.*;
import java.util.*;
public class SSMH {

  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static Node construct(Integer[] arr) {
    Node root = new Node(arr[0], null, null);
    Pair FirstRootPair = new Pair(root, 1);

    Stack<Pair> st = new Stack<>();
    st.push(FirstRootPair);

    int idx = 0;
    while (st.size() > 0) {
      Pair top = st.peek();
      if (top.state == 1) {
        idx++;
        if (arr[idx] != null) {
          top.node.left = new Node(arr[idx], null, null);
          Pair lp = new Pair(top.node.left, 1);
          st.push(lp);
        } else {
          top.node.left = null;
        }

        top.state++;
      } else if (top.state == 2) {
        idx++;
        if (arr[idx] != null) {
          top.node.right = new Node(arr[idx], null, null);
          Pair rp = new Pair(top.node.right, 1);
          st.push(rp);
        } else {
          top.node.right = null;
        }

        top.state++;
      } else {
        st.pop();
      }
    }

    return root;
  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += " <- " + node.data + " -> ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }

  public static int size(Node node) {
    // write your code here
    if(node == null){
      return 0;  
    }

    int leftS = size(node.left);
    int rightS = size(node.right);
    int totalS = leftS + rightS + 1;
    return totalS;

  }

  public static int sum(Node node) {
    // write your code here  
    if(node == null){
      return 0;  
    }

    int leftSum = sum(node.left);
    int rightSum = sum(node.right);
    int totalSum = leftSum + rightSum + node.data;
    return totalSum;
    
  }

  public static int max(Node node) {
    // write your code here
    if(node == null){
      return Integer.MIN_VALUE;
    }

    int leftM = max(node.left);
    int rightM = max(node.right);
    int totalM = Math.max(node.data , Math.max(leftM , rightM));
    return totalM;

  }

  public static int height(Node node) {
    // write your code here
    if(node == null){
      return -1; // -1 for edge , 0 for nodes
    }

    int leftH = height(node.left);
    int rightH = height(node.right);
    int totalH = Math.max(leftH , rightH) + 1;
    return totalH;

  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (values[i].equals("n") == false) {
        arr[i] = Integer.parseInt(values[i]);
      } else {
        arr[i] = null;
      }
    }

    Node root = construct(arr);

    int size = size(root);
    int sum = sum(root);
    int max = max(root);
    int ht = height(root);
    System.out.println(size);
    System.out.println(sum);
    System.out.println(max);
    System.out.println(ht);
  }

}
/*
Input --------------->
19
50 25 12 n n 37 30 n n n 75 62 n 70 n n 87 n n

Output ------------------>

9
448
87
3

*/

