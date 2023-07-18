package com.example.Problems;


import java.util.ArrayList;
import java.util.List;

public class Problem_144 {
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
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            traversal(root, result);
            return result;
        }
        public void  traversal(TreeNode root, List<Integer> result){
            if (root == null) return;
            result.add(root.val);
            traversal(root.left, result);
            traversal(root.right, result);
        }
    }
}
