package linkedLists;

public class _YRemoveDuplicateFromSortedList {

	public static ListNode deleteDuplicates2(ListNode head) {
		
		if (head == null)
			return null;
		
		ListNode FakeHead = new ListNode(0);
		FakeHead.next = head;
		ListNode pre = FakeHead; 
		ListNode cur = head;
		while (cur != null) {
			while (cur.next != null && cur.val == cur.next.val) {
				cur = cur.next;
			}
			if (pre.next == cur) {
				pre = pre.next;
			} else {
				pre.next = cur.next;
			}
			cur = cur.next;
		}
		return FakeHead.next;
	}
	
	public static void main(String[] args) {

		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(3);
		ListNode node5 = new ListNode(4);
		ListNode node6 = new ListNode(4);
		ListNode node7 = new ListNode(5);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = null;

		ListNode head1 = node1;

		ListNode nodeA = new ListNode(1);
		ListNode nodeB = new ListNode(1);
		ListNode nodeC = new ListNode(1);
		ListNode nodeD = new ListNode(2);
		ListNode nodeE = new ListNode(3);

		nodeA.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;
		nodeD.next = nodeE;
		nodeE.next = null;

		ListNode head2 = nodeA;

		System.out.println(deleteDuplicates2(head1));
	}
}

/*
 * Given a sorted linked list, delete all nodes that have duplicate numbers,
 * leaving only distinct numbers from the original list.
 * 
 * For example, 
 * Given 1->2->3->3->4->4->5, return 1->2->5.
 * Given 1->1->1->2->3, return 2->3.
 * 
 */
