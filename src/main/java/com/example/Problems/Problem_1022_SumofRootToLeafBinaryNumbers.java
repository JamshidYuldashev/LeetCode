package com.example.Problems;

public class Problem_1022_SumofRootToLeafBinaryNumbers {
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
        public int sumRootToLeaf(TreeNode root) {
            if (root == null)
                return 0;
            int ans=0;
            return helper(root, ans);
        }
        public int helper(TreeNode root, int ans){
            if (root == null) return 0;
            ans = 2 * ans + root.val;
            if (root.left == null && root.right == null)
                return ans;
            return helper(root.left, ans)+helper(root.right, ans);
        }
    }
}
