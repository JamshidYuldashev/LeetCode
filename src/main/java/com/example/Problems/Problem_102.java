package com.example.Problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem_102 {

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
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>>ans=new LinkedList<>();

            if(root==null){
                return ans;
            }

            Queue<TreeNode> n=new LinkedList<>();
            n.add(root);
            while(!n.isEmpty()){
                List<Integer>l=new ArrayList<>();
                int count=n.size();
                for(int i=0;i<count;i++){
                    TreeNode cur=n.poll();
                    l.add(cur.val);
                    if(cur.left!=null){
                        n.add(cur.left);
                    }
                    if(cur.right!=null){
                        n.add(cur.right);
                    }

                }

                ans.add(l);
            }
            return ans;

        }
    }
}
