package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
//        list.add(74);
//        list.add(736);
//        list.add(347);
//        System.out.println(list);
//        list.set(1, 634);
//        System.out.println(list);
        for(int i =0; i < 5; i++){
            list.add(in.nextInt());
        }
        for(int i = 0 ; i< 5 ; i++){
            System.out.println(list.get(i)); // pass index here list[index] this will not work here
        }
    }
}
