/*
 *   Stack <T>
 *   
 *   A generic interface for the
 *   implementation of a stack.
 */

public interface StackInterface <T>
{
	public void push(T item);  // Add item to top of stack
	public T pop();            // Delete and return top of stack.
	public T top();            // Return top of stack, don't delete.
	public boolean isEmpty();  // Return if stack is empty.
	public boolean isFull();   // Return if stack is full.
	public String toString();  // Return a string representation
}	                           //     of the stack.
	
