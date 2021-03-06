import java.util.*;

public class AddLastInLinkedList {
  public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;

    void addLast(int val) {
      // Write your code here
      Node temp = new Node();
      temp.data = val;
      temp.next = null;

      if(size == 0){
        head = tail = temp;
      }else{
        tail.next = temp;
        tail = temp;
      }

      size++;

    }
  }

  public static void testList(LinkedList list) {
    for (Node temp = list.head; temp != null; temp = temp.next) {
      System.out.println(temp.data);
    }
    System.out.println(list.size);

    if (list.size > 0) {
      System.out.println(list.tail.data);
    } 
  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);

    LinkedList list = new LinkedList();

    String str = scn.nextLine();
    while(str.equals("quit") == false){
      if(str.startsWith("addLast")){
        int val = Integer.parseInt(str.split(" ")[1]);
        list.addLast(val);
      } 
      str = scn.nextLine();
    }

    scn.close();

    testList(list);
  }
}

// Input --->

/*
addLast 10
addLast 20
addLast 30
addLast 40
addLast 50
quit
*/ 

// Output ----------->

// 10
// 20
// 30
// 40
// 50
// 5
// 50