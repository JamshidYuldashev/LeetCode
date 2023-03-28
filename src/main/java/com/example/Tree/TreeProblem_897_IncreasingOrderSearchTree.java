package com.example.Tree;

public class TreeProblem_897_IncreasingOrderSearchTree {
    public static void main(String[] args) {


    }
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }
    class Solution {
        TreeNode head;
        TreeNode p;
        public TreeNode increasingBST(TreeNode root) {
            traverse(root);
            return head;
        }
        private void traverse(TreeNode node) {
            if (node == null)  return;
            traverse(node.left);

            TreeNode n = new TreeNode(node.val);
            if (head == null) {
                head = n;
                p = n;
            } else {
                p.right = n;
                p = p.right;
            }
            traverse(node.right);
        }
    }
}