package Tree;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Binary_tree tree = new Binary_tree();
        tree.populate(scanner);
        tree.prettyDisplay();
    }
}
