import java.util.*;

/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution_4 {
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(pRoot == null) return result;

        queue.offer(pRoot);
        while(!queue.isEmpty()){
            int deepth = queue.size();
            ArrayList<Integer> line = new ArrayList<Integer>();
            for(int i = 0; i < deepth; i++){
                TreeNode temp = queue.poll();
                line.add(temp.val);
                if(temp.left != null)    queue.offer(temp.left);
                if(temp.right != null)    queue.offer(temp.right);
            }
            result.add(line);
        }
        return result;
    }

}