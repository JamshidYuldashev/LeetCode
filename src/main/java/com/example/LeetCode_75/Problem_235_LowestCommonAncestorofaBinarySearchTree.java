package com.example.LeetCode_75;

public class Problem_235_LowestCommonAncestorofaBinarySearchTree {
    public static void main(String[] args) {



    }
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    static class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root==null) return null;
            if (root.val > p.val && root.val > q.val)
                return lowestCommonAncestor(root.left, p, q);
            if (root.val < p.val && root.val < q.val)
                return lowestCommonAncestor(root.right, p, q);
            return root;
        }
    }
}
