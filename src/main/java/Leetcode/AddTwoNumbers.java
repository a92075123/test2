package Leetcode;

import java.sql.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class AddTwoNumbers {
    public static void main(String[] args) {
        int[] l1={2,4,3};
        int[] l2={5,6,4};
        Solution solution = new Solution();
        solution.addTwoNumbers(new ListNode(l1),new ListNode(l2));

    }
}

 class ListNode {
     int[] val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = new int[]{val}; }
     ListNode(int val, ListNode next) { this.val = new int[]{val}; this.next = next; }

     public ListNode(int[] l1) {
         this.val=l1;

     }
 }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        System.out.println(l1.val);
        System.out.println(l2);
        l1.next=l1;
        System.out.println(l1.next);
        return  l1;
    }
}
