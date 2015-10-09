
/*
 *    An implementation of the StackInterface.
 *    A singly linked list implementation is used.
 */

public class Stack <T> implements StackInterface<T> {

	private Node header = null; // Pointer to the first item in the list.
	
	/*
	 *   push(item) - add item to the stack.  It is at
	 *                the front of the list.
	 */
	
	public void push(T item)
	{
		Node ptr = new Node();  // Get a new node.
		
		ptr.data = item;    // Store the new item in the node.
		ptr.next = header;  // Link new node to front of list.
		header = ptr;       // New node is now at Top of Stack. 
	}
	
	
	/*
	 *   pop() - remove the top item from the stack and
	 *           return it as the function value.
	 */
	
	public T pop()
	{
		if (!isEmpty()) {
		    T item = top();        // Get the top item to return.
		    header = header.next;  // Remove top item from the stack.
		    return item;
		}
		return null;
	}
	
	/*
	 *   top() - return the top stack item.
	 */
	
	public T top()
	{
		if (!isEmpty()) {
		    return header.data;  // Return the item at the top
		}                        // of the stack.
		return null;
	}
	
	/*
	 *    isEmpty() - return True if the stack is empty
	 *                otherwise return False.
	 */
	
	public boolean isEmpty()
	{                             // The stack is empty if header
		return header == null;    // doesn't point to a Node.
	}
	
	
	public boolean isFull()    // For a linked list implementation
	{                          // the stack is never full.
		return false;
	}
	
	
	public String toString()
	{
		Node ptr = header;
		String str = "The Stack\n---------\n";
		
		while (ptr != null) {
			str = str + ptr.data.toString() + "\n";
			ptr = ptr.next;
		}
		
		str = str + "---------\n";
		return str;
	}
		
	
	/*
	 *    Inner Class - Node objects for a singly linked list.
	 *    
	 */

	private class Node
	{
		public T data;      // Data stored in the Node.
		public Node next;   // Pointer to next Node in the list.
	}
}
