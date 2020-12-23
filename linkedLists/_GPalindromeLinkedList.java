package linkedLists;

public class _GPalindromeLinkedList {

	static boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null)
			return true;

		// use floyd method to find the mid element
		ListNode slow = head;
		ListNode fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		slow = reverseList(slow.next);

		while (slow != null) {
			if (head.val != slow.val)
				return false;
			head = head.next;
			slow = slow.next;
		}
		return true;
	}

	static ListNode reverseList(ListNode head) {
		ListNode pre = null;  
		ListNode next = null;
		while (head != null) {
			next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;
	}

	public static void main(String[] args) {

		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(2);
		ListNode node5 = new ListNode(1);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = null;

		ListNode head = node1;

		System.out.println(isPalindrome(head));
	}
}


/*
 * Given a singly linked list, determine if it is a palindrome
 * 
 */
