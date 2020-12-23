package linkedLists;

public class _YRotateList {

	public static ListNode rotateRight(ListNode head, int n) {
		if (head == null || head.next == null)
			return head;
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode fast = dummy, slow = dummy;

		int i;
		for (i = 0; fast.next != null; i++) 
			fast = fast.next;

		for (int j = i - n % i; j > 0; j--) 
			slow = slow.next;

		fast.next = dummy.next; 
		dummy.next = slow.next;
		slow.next = null;

		return dummy.next;
	}

	public static void main(String[] args) {

		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = null;
		
		ListNode head = n1;
		
		System.out.println(rotateRight(head, 2));
	}
}

/*
 * Given a list, rotate the list to the right by k places, where k is
 * non-negative.
 * 
 * For example: Given 1->2->3->4->5->NULL and k = 2, return 4->5->1->2->3->NULL.
 * 
 */
