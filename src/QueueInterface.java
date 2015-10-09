/*
 *   Author: 
 *   Date:   mm/dd/yyyy
 *   
 *   This is an interface for a classic Queue
 *   implementation.  A queue is a linear structure
 *   in which items enter at the rear and leave from
 *   the front.  Hence, a queue is a first-in,
 *   first-out store - a FIFO.
 */

public interface QueueInterface<T> {
	
	public void enqueue(T item);  // Add to the rear of the queue.
	public T dequeue();           // Delete and return the item
	                              // at the front of the queue.
    public T front();    // Return the item at the front
                         // of the queue, do not delete.
    
    public boolean isEmpty();     // Check if the queue is empty.
    public boolean isFull();      // Check if the queue is full.
    
    public String toString();     // Return a printable display 
                                  // of the items in the queue.
}
