/**Maximum Depth of Binary Tree
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
    public int maxDepth(TreeNode root) { //traverse route review needed
        if(root == null) return 0;
        else{
            int max = Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
            //System.out.printf("root.left:%d, root.right:%d, max:%d%n", maxDepth(root.left) + 1, maxDepth(root.right) + 1, max);
            return max;
        }   
    }
}
