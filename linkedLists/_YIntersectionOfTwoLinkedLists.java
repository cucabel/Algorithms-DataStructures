package linkedLists;

public class _YIntersectionOfTwoLinkedLists {

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		if (headA == null || headB == null)
			return null;

		ListNode a = headA; 
		ListNode b = headB; 

		while (a != b) {
			a = a == null ? headB : a.next; 
			b = b == null ? headA : b.next;
		}

		return a; 
	}
	
	public static void main(String[] args) {
		
		ListNode a1 = new ListNode(1);
		ListNode a2 = new ListNode(2);
		ListNode b1 = new ListNode(3);
		ListNode b2 = new ListNode(4);
		ListNode c1 = new ListNode(5);
		ListNode c2 = new ListNode(6);
		ListNode c3 = new ListNode(7);
		
		a1.next = a2;
		a2.next = c1;
		b1.next = b2;
		b2.next = c1;
		c1.next = c2;
		c2.next = c3;
		c3.next = null;
		
		ListNode headA = a1;
		ListNode headB = b1;
		
		System.out.println(getIntersectionNode(headA, headB));
		
	}
}

/*
 * Write a program to find the node at which the intersection of two singly linked lists begins. 
 * 
 * Notes:
 * If the two linked lists have no intersection at all, return null. 
 * The linked lists must retain their original structure after the function returns. 
 * You may assume there are no cycles anywhere in the entire linked structure. 
 * Your code should preferably run in O(n) time and use only O(1) memory.
 * 
 * For example, the following two linked lists:
 * 
 * A:       a1 -> a2 -> 
 * 						 \
 * 							c1 -> c2 -> c3
 *  					 /
 * B: b1 -> b2 -> b3 ->
 * 
 * begin to intersect at node c1.
 * 
 */
