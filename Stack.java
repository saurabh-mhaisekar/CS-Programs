class Node{
  int data;
  Node next;

  public Node(int key){
    this.data = key;
    this.next = null;
  }
}

public class Stack{
  public static Node push(int key, Node head){
    Node newNode = new Node(key);
    if (head == null) return newNode;

    newNode.next = head;
    head = newNode;

    return head;
  }

  public static void traverse(Node head){
    if(head == null) return;

    do{
      System.out.print(head.data+" ");
      head = head.next;
    }while(head != null);
  }

  public static Node pop(Node head){
    if(head == null) return null;
    head = head.next;
    return head;
  }
  public static void main(String[] args){
    Node head = null;
    head = push(100,head);
    head = push(200,head);
    head = push(300,head);
    head = push(900,head);
    traverse(head);
    System.out.println("\n");
    head = pop(head);
    traverse(head);
    System.out.println("\n");
    head = pop(head);
    traverse(head);
    System.out.println("\n");
    head = pop(head);
    traverse(head);
    System.out.println("\n");
    head = pop(head);
    traverse(head);
    System.out.println("\n");
  }
}
