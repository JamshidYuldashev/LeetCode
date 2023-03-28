package com.example.LeetCode_75;

public class Problem_206_ReverseLinkedList {

    public static void main(String[] args) {

    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode cur = head;
            while (cur != null) {
                ListNode temp = cur.next;
                cur.next = prev;
                prev = cur;
                cur = temp;
            }
            return prev;
        }
    }
}
