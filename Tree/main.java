package Tree;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Binary_tree tree = new Binary_tree();
//        tree.populate(scanner);
//        tree.display();

        BST tree = new BST();
        int[] nums = {5,2,7,1,4,6,9,8,3,10};
        // suppose we have a shorted array then
        // nums {1,2,3,4,5,6,7,8,9,10}
        // then we will choose middle as a root which 5
        // then for left choose anothe rmiddle element for parent node which is 2
        // do it for right hand side
        tree.populate(nums);
        tree.display();
        tree.balanced();
    }
}
