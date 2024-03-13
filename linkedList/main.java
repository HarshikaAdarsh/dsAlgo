package linkedList;

public class main {
    public static void main (String[] args) {
        // This is how you can access inbuilt linked list
        // LinkedList<Integer> list = new LinkedList<>();
        // list.add(34);
        LL list = new LL();
        list.insertFirst(1);
        list.insertFirst(20);
        list.insertFirst(3);
        list.insertFirst(3);
        list.insertFirst(17);
        list.insertFirst(3);
        list.insertFirst(3);
        list.insertFirst(3);
        list.insertFirst(40);
//        list.insertLast(77);
        list.insert(100, 4);
        list.display();
        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");

        list.ReversePrint(list.head);
      //  list.ConversionSinglyToCircular();
      //  list.display();

        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println(list.Ifcircular(list.head, list.tail));
        System.out.println(list.CountInt(list.head, 3));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();

        System.out.println(list.MiddleNode(list.head));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();

        System.out.println(list.GetNnode( 3));
 //      System.out.println(list.GetLastNnode(4));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println(list.findSizeRecurrsion(list.head));
        System.out.println(list.findSizewithoutRecurrsion(list.head));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();

        System.out.println(list.Search(5,list.head));
        System.out.println(list.countSize(list.head));
        list.display();
        System.out.println(list.find(3));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();

        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();

    }
        // Doubly Linked List
//
//        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//
//        DLL list = new DLL();
//        list.insertFirst(1);
//        list.insertFirst(2);
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertLast(99);
//        list.insert(3,70);
//        list.display();
//  }

        // Circular linked list

//        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//
//         CLL list = new CLL();
//         list.insert(7);
//        list.insert(5);
//        list.insert(9);
//        list.insert(3);
//        list.insert(6);
//        list.insert(19);
//        list.insert(29);
//
//        list.display();
//        list.delete(9);
//        list.display();
//        System.out.println("Check if list is circular or not " + list.Ifcircular(list.head , list.tail));
//        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        System.out.println(" size of Circular list = " + list.NumberOfNodes());
//        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//   //     System.out.println(list.ExchangeNodes(list.head));
//        list.display();
//
//    }
//


  }
