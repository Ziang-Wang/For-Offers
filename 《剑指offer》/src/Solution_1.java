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
public class Solution_1 {
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(pRoot == null)    return result;
        Stack<TreeNode> stackL_R = new Stack<TreeNode>();
        Stack<TreeNode> stackR_L = new Stack<TreeNode>();
        stackL_R.push(pRoot);
        while(!stackL_R.empty() || !stackR_L.empty()){
            ArrayList<Integer> line1 = new ArrayList<Integer>();
            while(!stackL_R.empty()){
                TreeNode temp = stackL_R.pop();
                if(temp.left != null)    stackR_L.push(temp.left);
                if(temp.right != null)    stackR_L.push(temp.right);
                line1.add(temp.val);
            }
            if(line1.size() != 0)    result.add(line1);

            ArrayList<Integer> line2 = new ArrayList<Integer>();
            while(!stackR_L.empty()){
                TreeNode temp = stackR_L.pop();
                if(temp.right != null)    stackL_R.push(temp.right);
                if(temp.left != null)    stackL_R.push(temp.left);
                line2.add(temp.val);
            }
            if(line2.size() != 0)    result.add(line2);

        }
        return result;
    }

}