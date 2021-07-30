package linkedLists;

public class _GLinkedListCycle {

	public static boolean hasCycle(ListNode head) {
		if (head == null)
			return false;
		ListNode walker = head;
		ListNode runner = head;
		while (runner.next != null && runner.next.next != null) {
			walker = walker.next;
			runner = runner.next.next;
			if (walker == runner)
				return true;   
		}
		return false;
	}
	
	public static void main(String[] args) {

		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(6);
		ListNode node4 = new ListNode(3);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node2;

		ListNode head = node1;

		System.out.println(hasCycle(head));

	}
}

/*
 * Given a linked list, determine if it has a cycle (repeating sequence) in it.
 * 
 * Follow up: Can you solve it without using extra space?
 * 
 */
