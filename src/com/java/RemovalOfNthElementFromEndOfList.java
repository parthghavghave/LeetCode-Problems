package com.java;

public class RemovalOfNthElementFromEndOfList {
	public static void main(String[] args) {
//		ListNode l1node1 = new ListNode(5);
//		ListNode l1node2 = new ListNode(4, l1node1);
//		ListNode l1node3 = new ListNode(3, l1node2);
		ListNode l1node4 = new ListNode(2);
		ListNode l1node5 = new ListNode(1, l1node4);

		ListNode l2 = removeNthFromEnd(l1node5, 1);
		System.out.println("------");
		while (l2.next != null) {
			System.out.println(l2.val);
			l2 = l2.next;
		}
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode result = head;
		ListNode pointer = head;

		if (head.next == null && n == 1) {
			return null;
		}

		int counter = 0;
		while (head.next != null) {
			if (counter++ >= n) {
				pointer = pointer.next;
			}
			head = head.next;
		}
		System.out.println(head.val);
		System.out.println(pointer.val);
		pointer.next = head;

		return result;
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
