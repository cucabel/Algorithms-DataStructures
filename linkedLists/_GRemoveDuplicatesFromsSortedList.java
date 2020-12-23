package linkedLists;

public class _GRemoveDuplicatesFromsSortedList {
	
	public static ListNode deleteDuplicates(ListNode l1) {
		
		ListNode dummy = new ListNode(0);
		ListNode l2 = dummy;
		
		while (l1 != null) {
			if (l1.val == l1.next.val) {
				l2.next = l1.next;
				l1 = l1.next.next;
			} else {
				l2.next = l1;
				l1 = l1.next;
			}
			l2 = l2.next;
		}
		return dummy.next;
	}	
	
	public static void main(String[] args) {

		ListNode node1 = new ListNode(1);										
		ListNode node2 = new ListNode(1);							
		ListNode node3 = new ListNode(2);							
		ListNode node4 = new ListNode(3);
		ListNode node5 = new ListNode(3);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = null;
		
		ListNode head = node1;
		
		ListNode outputLinkedList = deleteDuplicates(head);
		System.out.println(outputLinkedList);

	}
	
}
