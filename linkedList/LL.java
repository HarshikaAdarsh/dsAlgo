package linkedList;

public class LL {

    public Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size = 0;
    }
    // Insertion

    public int countSize(Node head){
        if (head == null){
            return 0;
        }

        return 1 + countSize(head.next);
    }

    public  Boolean Search(int value , Node head){

            if(head == null){
                return false;
            }
            if(head.value ==  value ){
                return true;
            }

            return  Search(value,head.next);
    }

    // Question1) find size of linked list using recurrsion
    public int findSizeRecurrsion(Node head){
        size = 0 ;
        if(head ==null){
            return 0;
        }
        return size = 1 + findSizeRecurrsion(head.next);
    }

    // Question2) find size of linked list without using recurrsion
    public int findSizewithoutRecurrsion(Node head){
        size =0;
        Node temp = head;
        while (temp != null){
            size = size+1;
            temp = temp.next;
        }
        return size;
    }

    // Question3)  a function to get Nth node in a Linked List
     public int GetNnode(Node head, int index){
        Node temp = head;
        int value = 0;
         while(temp != index){
            if(temp == N){
                value =  temp.value;
            }
            temp = temp.next;
        }
        return value;
     }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node ;

        if(tail == null){
            tail = head ;
        }
        size += 1;
    }

    public void insertLast(int val){
        if (tail == null){
            insertFirst(val);
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node ;

        size += 1;
    }
    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        else if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head ;
        for (int i = 1; i < index; i++) {
            temp = temp.next;

        }
        Node node = new Node(val, temp.next);
//        Node Moretemp = temp.next;
//        temp.next = node ;
//        node = Moretemp ;
        temp.next = node;
        size ++;

    }


    //  Deletion
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size-- ;
        return val;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node ;
    }
    public int deleteLast(){
      if(size <= 1){
          return deleteFirst();
      }
      Node secondLast = get(size-2);
      int val = tail.value;
      tail = secondLast;
      tail.next = null;
      return val;
     }

     public int delete(int index){
        if(index == 0 ){
            deleteFirst();
        }
        if(index == size -1 ){
            deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
     }

     // Search

        public Node find(int value){
            Node node = head;
            while(node != null){
                if( node.value == value){
                    return node ;
                }
                node = node.next ;
            }
            return null;
        }

    public void display(){
        Node temp = head ;
         while(temp != null){
             System.out.print(temp.value + " -> ");
             temp = temp.next;
         }
        System.out.print("End");
    }

    private class Node{

        private int value;
        private Node next;

        public Node(int value)
        {
            this.value = value ;
        }
        public Node(int value, Node next){
            this.value = value ;
            this.next = next;
        }
    }
}
