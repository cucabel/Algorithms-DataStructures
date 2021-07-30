package linkedLists;

public class _YInsertionSortList { /* sorting package */

	public static ListNode insertionSortList(ListNode head) {

		if (head == null) {
			return head;
		}

		ListNode helper = new ListNode(0); 
		ListNode cur = head; 
		ListNode pre = helper; 
		ListNode next = null; 

		while (cur != null) {

			next = cur.next; 

			while (pre.next != null && pre.next.val < cur.val) {
				pre = pre.next;
			}

			cur.next = pre.next;
			pre.next = cur;
			pre = helper;
			cur = next; 
		}

		return helper.next;
	}
	
	public static void main(String[] args) {
		
		ListNode n1 = new ListNode(6);
		ListNode n2 = new ListNode(5);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(1);
		ListNode n5 = new ListNode(8);
		ListNode n6 = new ListNode(7);
		ListNode n7 = new ListNode(2);
		ListNode n8 = new ListNode(4);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		n8.next = null;
		
		ListNode head = n1;
		
		System.out.println(insertionSortList(head));
	}
}
