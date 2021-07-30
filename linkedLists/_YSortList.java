package linkedLists;

public class _YSortList {

		public static ListNode sortList(ListNode head) {

			if (head == null || head.next == null)
				return head;

			ListNode prev = head, slow = head, fast = head;

			while (fast != null && fast.next != null) {
				prev = slow; 
				slow = slow.next;
				fast = fast.next.next;
			}

			prev.next = null;

			ListNode l1 = sortList(head); 
			ListNode l2 = sortList(slow); 

			return merge(l1, l2);
		}

		static ListNode merge(ListNode l1, ListNode l2) {

			ListNode l = new ListNode(0), p = l;

			while (l1 != null && l2 != null) {
				if (l1.val < l2.val) {
					p.next = l1;
					l1 = l1.next;
				} else {
					p.next = l2;
					l2 = l2.next;
				}
				p = p.next;
			}

			if (l1 != null)
				p.next = l1;

			if (l2 != null)
				p.next = l2;

			return l.next;
		}
		
		public static void main(String[] args) {
			
			ListNode node1 = new ListNode(4);
			ListNode node2 = new ListNode(1);
			ListNode node3 = new ListNode(5);
			ListNode node4 = new ListNode(2);
			ListNode node5 = new ListNode(3); 

			node1.next = node2;
			node2.next = node3;
			node3.next = node4;
			node4.next = node5;
			node5.next = null;

			ListNode head = node1;
			
			sortList(head);
			System.out.println(head);
		}
}
