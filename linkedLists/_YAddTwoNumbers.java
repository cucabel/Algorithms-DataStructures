package linkedLists;

public class _YAddTwoNumbers {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode curr = null, head = null;
		int sum = 0, carry = 0;

		while (l1 != null || l2 != null) {
			sum = carry;
			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}

			ListNode n = new ListNode(sum % 10);

			if (curr == null) {
				curr = n;
				head = n; 
			} else {
				curr.next = n;
				curr = curr.next;
			}

			carry = sum / 10;
		}

		if (carry == 1) {
			curr.next = new ListNode(1);
		}

		return head != null ? head : new ListNode(0);

	}
	
	public static void main(String[] args) {
		
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(4);
		ListNode node3 = new ListNode(3);

		node1.next = node2;
		node2.next = node3;
		node3.next = null;

		ListNode head1 = node1;

		ListNode nodeA = new ListNode(5);
		ListNode nodeB = new ListNode(6);
		ListNode nodeC = new ListNode(4);

		nodeA.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = null;

		ListNode head2 = nodeA;

		System.out.println(addTwoNumbers(head1, head2));
		
	}

}

/*
 * You are given two non-empty linked lists representing two non-negative
 * integers (*). The digits are stored in reverse order and each of their nodes
 * contain a single digit. Add the two numbers and return it as a linked list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
 * 
 */
