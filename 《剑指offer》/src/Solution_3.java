/*
public class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
*/
public class Solution_3 {
    public TreeLinkNode GetNext(TreeLinkNode pNode){
        if(pNode == null)    return null;

        if(pNode.right != null){
            TreeLinkNode p = pNode.right;
            while(p.left != null){
                p = p.left;
            }
            return p;
        }
        TreeLinkNode p = pNode;
        while(p.next != null){
            if(p.next.left == p){
                return p.next;
            }
            p = p.next;
        }
        return null;
    }
}