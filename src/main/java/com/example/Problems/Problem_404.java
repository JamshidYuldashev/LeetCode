package com.example.Problems;

public class Problem_404 {
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

    static class Solution {
        boolean isLeaf(TreeNode node){
            if (node==null)
                return false;

            return node.left == null && node.right == null;
        }

        public int sumOfLeftLeaves(TreeNode root) {
            int ans=0;
            if (root!= null){
                if (isLeaf(root.left))
                    ans+=root.left.val;
                else
                    ans+=sumOfLeftLeaves(root.left);
                ans+=sumOfLeftLeaves(root.right);
            }
            return ans;
        }
    }
}
