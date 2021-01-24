/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        traversal(root,lst);
        return lst;
    }
    public static void traversal(TreeNode root, List<Integer> lst) {
        if (root!=null) {
            traversal(root.left,lst);
            lst.add(root.val);
            traversal(root.right,lst);
        }
    }
}
