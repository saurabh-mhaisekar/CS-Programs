public class LinkedList{
  public static void main(String[] args){
    Node head = new Node();
    traverse(head);
    head = append(10,head);
    head = append(99,head);
    traverse(head);
  }

  public static Node append(int data, Node head){
    Node temp = new Node(data);
    if(head == null) return head;
    while(head.next != null){
      head = head.next;
    }
    head.next = temp;
    return head;
  }

  public static void traverse(Node head){
    if(head == null){
      System.out.println("There is nothing to show");
    }
    while(head.next != null){
      System.out.println(head.data);
      head = head.next;
    }
  }


}
class Node{
  int data;
  Node next;

  public Node(){
    next = null;
  }

  public Node(int data){
    this.data = data;
  }
}
