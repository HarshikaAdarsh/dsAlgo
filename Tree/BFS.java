package Tree;

import java.util.ArrayList;

public class BFS {
    public static void main(String[] args) {
        System.out.println();
    }
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();

        if(root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!q.isEmpty()){
            int levelSize = queue.size();
            for(int i =0 ; i< levelsize; i++){
                TreeNode currentNode = queue.poll();
            }
        }

        return result;
    }
}
