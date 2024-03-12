package linkedList;

public class CLL {

    public Node head;
    public Node tail;

    public CLL(){
        this.head = null;
        this.tail = null;
    }

    // Question 7) Check if a linked list is Circular Linked List
    public Boolean Ifcircular (Node head, Node tail){
        Node node = head;
        while(node != null){
            if( tail.next == head ){
                return true;
            }
            else{
                return false;
            }

        }
        return false;
    }

    // question8)  Count nodes in Circular linked list
    public int NumberOfNodes (){
        Node node = head;
        int count = 0 ;
        while(node.next != head){
            count = count+ 1;
            node = node.next;

        }
        return count+1 ;
    }

    // question9) Exchange first and last nodes in Circular Linked List

    public void ExchangeNodes(Node head){
        Node node = head;
        int temp;
        while(node.next != head){
            if(node.next == head){
                temp = node.val;
                node.val = head.val;
                head.val = temp;
            }
            node = node.next;
        }
    }

    public void insert(int val){
      Node node = new Node(val);
      if(head == null){
          head = node;
          tail = node;
          return;
      }
      tail.next = node;
      node.next = head;
      tail = node ;
    }
     public void display(){
        Node node = head;
        if(head != null){
            do{
                System.out.print(node.val + " -> ");
                node = node.next;
            }while (node != head);
        }
         System.out.println("HEAD");
     }

     public void delete(int val){
          Node node = head ;
          if(node == null){
              return;
          }
          if (node.val == val){
              head = head.next;
              tail.next = head ;
              return;
          }
          do{
              Node n = node.next;
              if(n.val == val){
                  node.next = n.next;
                  break;
              }
              node = node.next;

          }while(node != head);
     }
    private class Node {
        int val ;
        Node next;

        public Node (int val){
            this.val = val;
        }
    }
}
