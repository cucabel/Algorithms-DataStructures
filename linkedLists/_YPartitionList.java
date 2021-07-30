package linkedLists;

public class _YPartitionList {

	public static ListNode partition(ListNode head, int x) {

		ListNode dummy1 = new ListNode(0), dummy2 = new ListNode(0);

		ListNode curr1 = dummy1, curr2 = dummy2;

		while (head != null) {
			if (head.val < x) {
				curr1.next = head;
				curr1 = curr1.next; 
			} else {
				curr2.next = head;
				curr2 = curr2.next;
			}
			head = head.next;
		}

		curr2.next = null;
		curr1.next = dummy2.next;
		return dummy1.next;
	}
	
	public static void main(String[] args) {
		
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(4);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(2);
		ListNode n5 = new ListNode(5);
		ListNode n6 = new ListNode(2);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = null;
		
		ListNode head = n1;
		
		System.out.println(partition(head, 3));
		
	}
}

/*
 * Given a linked list and a value x, partition it such that all nodes
 * less than x come before nodes greater than or equal to x.
 * 
 * You should preserve the original relative order of the nodes in each of the
 * two partitions.
 * 
 * For example, Given 1->4->3->2->5->2 and x = 3, return 1->2->2->4->3->5.
 * 
 */
