package com.example.Tree;

public class TreeProblem_938_RangeSumofBST {
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
        int result = 0;
        public int rangeSumBST(TreeNode root, int low, int high) {
            check(root, low, high);
            return result;
        }
        void check(TreeNode root, int l, int h){
            if (root == null)
                return;
            if (l <= root.val && root.val <= h)
                result +=root.val;

            check(root.left, l, h);
            check(root.right, l, h);
        }
    }
}