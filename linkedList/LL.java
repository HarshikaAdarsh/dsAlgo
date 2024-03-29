package linkedList;

public class LL {

    @Override
    public String toString() {
        return super.toString();
    }

    public Node head;
    public  Node tail;
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
     public int GetNnode(int N){
        Node node = head ;
        int value = 0 ;
        for(int i = 1 ; i <= N ; i++){
            if(i == N){
                value = node.value;
            }
            node = node.next;
        }
        return value ;
     }

     // Question4) Nth node from the end of a Linked List

    public int GetLastNnode (int N){
        size = 0 ;
        Node temp = head;
        Node node = head;
        int Nthindex = 0;
        int value = 0;
        while(temp != null){
            size = size+1;
            temp = temp.next;
        }

        Nthindex = size - N ;
        for(int i =0 ; i < Nthindex ; i++){
            if(i == Nthindex){
                value = node.value;
            }
            node = node.next;
        }
        return value;
    }

    // Question5) Print the middle of a given linked list
    public int MiddleNode (Node head){
        Node fast = head;
        Node slow = head;
            do{
                fast = fast.next.next;
                slow = slow.next;
            }
            while (fast != null && fast.next != null);
        return slow.value;
    }

   // Question6) a function that counts the number of times a given int occurs in a Linked List
    public int CountInt (Node head, int val){
        int count = 0;
        Node node = head ;
        while (node != null){

            if(node.value == val){
                count = count+1;

            }
            node = node.next;
        }
        return count ;
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

    // Question8)  Convert singly linked list into circular linked list
    public Node ConversionSinglyToCircular(){
         Node start = head;
         while(start != null){
             head = head.next ;
         }
         head.next = start;
        return start;

    }

    //Question9)
      public void ReversePrint(Node head){

          if (head == null)
              return;

          ReversePrint(head.next);

          System.out.print(head.value + " -> ");
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

        @Override
        public String toString() {
            return Integer.toString(this.value);
        }

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
