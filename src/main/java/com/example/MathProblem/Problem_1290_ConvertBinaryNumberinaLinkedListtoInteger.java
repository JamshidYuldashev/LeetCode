package com.example.MathProblem;

public class Problem_1290_ConvertBinaryNumberinaLinkedListtoInteger {
    public static void main(String[] args) {

    }

    //  1 0 1
    /*  1 -> num = 1
        0 -> num = 1*2+0 = 2
        1 -> num = 2*2+1 = 5

       ans = 5
     */

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    static class Solution{
        public int getDecimalValue(ListNode head) {
            int num = head.val;
            while (head.next != null){
                num = num*2+head.next.val;
                head=head.next;
            }
            return num;
        }
    }
}
