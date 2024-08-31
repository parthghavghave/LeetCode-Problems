package com.java;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */

public class AddTwoNumbers {
	public static void main(String[] args) {
		ListNode l1node1 = new ListNode(2);
		ListNode l1node2 = new ListNode(4, l1node1);
		ListNode l1node3 = new ListNode(3, l1node2);
		
		ListNode l2node1 = new ListNode(5);
        ListNode l2node2 = new ListNode(6, l2node1);
        ListNode l2node3 = new ListNode(4, l2node2);

        ListNode result = addTwoNumbers(l1node3, l2node3);
        
        while(result != null) {
        	System.out.println(result.val);
        	result = result.next;
        }
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int sum = x + y + carry;
            carry = sum / 10;

            current.next = new ListNode(sum % 10);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummyHead.next;
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
}
