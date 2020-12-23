package linkedLists;

public class _GMergeTwoSortedLists {

	private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		ListNode l3 = dummy;
		
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				l3.next = l1;
				l1 = l1.next;
			} else {
				l3.next = l2;
				l2 = l2.next;
			}
			l3 = l3.next;                                                                                                    
		}
		
		if (l1 != null) {
			l3.next = l1;
		}
		
		if (l2 != null) {
			l3.next = l2;
		}
		
		return dummy.next;
		
	}

	public static void main(String[] args) {								
		ListNode node1 = new ListNode(3);									
		ListNode node2 = new ListNode(6);									
		ListNode node3 = new ListNode(7);
		ListNode node4 = new ListNode(9);									
																			
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = null;
		
		ListNode linkedlist1head = node1;
		
		ListNode nodeA = new ListNode(1);
		ListNode nodeB = new ListNode(2);
		ListNode nodeC = new ListNode(5);
		ListNode nodeD = new ListNode(8);
		
		nodeA.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;
		nodeD.next = null;
		
		ListNode linkedlist2head = nodeA;
		
		ListNode outputLinkedList = mergeTwoLists(linkedlist1head, linkedlist2head);
		System.out.println(outputLinkedList);		
		
	}
	
}
