package stack;

import java.util.Stack;

public class _GMinStack {

	int min = Integer.MAX_VALUE;

	Stack<Integer> stack = new Stack<>(); 

	public void push(int x) {

		if (x <= min) {
			stack.push(min);
			min = x;
		}
		stack.push(x);
	}

	public void pop() {

		if (stack.pop() == min) 
			min = stack.pop();  
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return min;
	}

	public static void main(String[] args) {
		
		_GMinStack minStack = new _GMinStack();
		minStack.push(-2); 
		minStack.push(0); 
		minStack.push(-3);
		System.out.println(minStack.getMin()); 

		minStack.pop(); 
		System.out.println(minStack.top());
		System.out.println(minStack.getMin());
	}
}

/*
 * Design a stack that supports push, pop, top, and retrieving the minimum
 * element in constant time.
 * 
 * push(x) - Push element x onto stack. 
 * pop() - Removes the element on top of the stack. 
 * top() - Get the top element. 
 * getMin() - Retrieve the minimum element in the stack.
 * 
 * Example: 
 * MinStack minStack = new MinStack();
 * 
 * minStack.push(-2); 
 * minStack.push(0); 
 * minStack.push(-3); 
 * minStack.getMin();
 * returns -3
 * 
 * minStack.pop(); 
 * minStack.top(); 
 * returns 0 
 * minStack.getMin(); 
 * returns -2
 * 
 * Your MinStack object will be instantiated and called as such: 
 * MinStack obj = new MinStack(); 
 * obj.push(x); 
 * obj.pop(); 
 * int param_3 = obj.top(); 
 * int param_4 = obj.getMin();
 * 
 */
