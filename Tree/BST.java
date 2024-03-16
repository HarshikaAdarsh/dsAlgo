package Tree;

public class BST {
    public class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public BST() {  // Constructor

    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) { // constructor
     root = insert( value, root);
    }

    public Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value < node.value) {
            node.left = insert(value, node.left);
        }
        if (value > node.value) {
            node.right = insert(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right))  +  1;
        return node ;
    }

    public void populate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
           this.insert(nums[i]);
        }
    }
    public void populateSorted(int[] nums){
      populateSorted(nums, 0 ,nums.length);
    }
    private void populateSorted(int[] nums, int start, int end){
        if(start >= end){
            return;
        }
        int mid = (start + end)/2;
        this.insert(nums[mid]);
        populateSorted( nums, start, mid);
        populateSorted( nums, mid+1 , end);
    }
        public Boolean balanced(){
            return balanced (root);
        }
        private boolean balanced(Node node) {
            if (node == null) {
                return true;
            }
            return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
        }

    public void display(){
        display(this.root,"Root Node : ");
    }
    private void display(Node node, String details){
        if(node == null){
            return;
        }
        System.out.println(details + node.getValue());

        display(node.left, "Left Child of" + node.getValue() + " : ");
        display(node.right, "Right Child of" + node.getValue() + " : ");
    }

}
