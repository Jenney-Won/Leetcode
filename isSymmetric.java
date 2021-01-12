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
 // base case의 중요성: 각 노드가 null일 때 경우 꼭 
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root != null){ // root has value
            return isSymmetric(root.left, root.right);
        }
        return true; // root is null -> nothing to compare -> true
    }
    
    private boolean isSymmetric(TreeNode leftNode, TreeNode rightNode){
        // if both null -> equal -> true
        if(leftNode == null && rightNode == null){
            return true;
        }
        else if(leftNode != null && rightNode != null){
            // if left.val is equal to right.val, traverse down to compare more values
            if(leftNode.val == rightNode.val){ 
                return isSymmetric(leftNode.left, rightNode.right) 
                    && isSymmetric(leftNode.right, rightNode.left);
            }
        }
        return false;
    }
}
