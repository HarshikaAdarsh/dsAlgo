package linkedList;

public class main {
    public static void main (String[] args){
        // This is how you can access inbuilt linked list
        // LinkedList<Integer> list = new LinkedList<>();
        // list.add(34);
//       LL list = new LL();
//       list.insertFirst(1);
//        list.insertFirst(2);
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertFirst(17);
//        list.insertLast(77);
//        list.insert(100,4);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();
//        System.out.println(list.find(3));

        // Doubly Linked List

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        DLL list = new DLL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertLast(99);
        list.insert(3,99);
        list.display();



    }
}
