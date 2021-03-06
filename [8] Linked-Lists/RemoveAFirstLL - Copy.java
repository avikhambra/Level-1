
import java.util.*;

public class RemoveAFirstLL {
  public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;

    void addLast(int val) {
      Node temp = new Node();
      temp.data = val;
      temp.next = null;

      if (size == 0) {
        head = tail = temp;
      } else {
        tail.next = temp;
        tail = temp;
      }

      size++;
    }

    public int size(){
      return size;
    }

    public void display(){
      for(Node temp = head; temp != null; temp = temp.next){
        System.out.print(temp.data + " ");
      }
      System.out.println();
    }

    public void removeFirst(){
      // write your code here
      if(size == 0){
        System.out.println("List is empty");
      }else if(size == 1){
        head = tail = null;
        size = 0;
      }else{
        head = head.next;
        size--;
      }
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);

    LinkedList list = new LinkedList();

    String str = scn.next();
    while(str.equals("quit") == false){
      if(str.startsWith("addLast")){
        int val = Integer.parseInt(str.split(" ")[1]);
        list.addLast(val);
      } else if(str.startsWith("size")){
        System.out.println(list.size());
      } else if(str.startsWith("display")){
        list.display();
      } else if(str.startsWith("removeFirst")){
        list.removeFirst();
      }
      str = scn.nextLine();
    }
    scn.close();
  }
}

// Input --------->

// addLast 10
// addLast 20
// addLast 30
// display
// removeFirst
// size
// addLast 40
// addLast 50
// removeFirst
// display
// size
// removeFirst
// removeFirst
// removeFirst
// removeFirst
// quit

// Output ----------------->

// 10 20 30 
// 2
// 30 40 50 
// 3
// List is empty
