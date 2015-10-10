/*
 *   class QueueS
 *   Authors: ALiya Gangji and Casie Ropski
 *   Date: October 9th 2015
 *   Class: Data Structures and Algorithms
 *   Description: 
 *   An implementation of the QueueInterface using stacks.
 */

public class QueueS<T> implements QueueInterface<T>
{
	
	Stack<T> stk1 = new Stack<T>(); 
	Stack<T> stk2 = new Stack<T>();
	
	/*
	 *    The Queue constructor.
	 */
	
	public QueueS()
	{
		return;
	}

	/*
	 *    enqueue() - add an item to the rear of the queue.
	 *                Do nothing if the queue is full.
	 */
	
	public void enqueue(T item)
	{
		return;
	}
	
    /*
     *   dequeue() - delete and return the front item
     *               in the queue. Return null if 
     *               the queue is empty.
     */
	
	public T dequeue()
	{
		return null;
	}
	
	/*
	 *    front() - Return (but do not delete) the item
	 *              at the front of the queue.
	 */
	
    public T front()
    {
    	return null;
    }
    
    /*
     *    isEmpty() - returns true if the queue is empty 
     *                else returns false.
     */
    
    public boolean isEmpty()
    {
    	return true;
    }
    
    /*
     *    isFull() - returns true if the queue is empty 
     *               else returns false.
     */
    
    public boolean isFull()
    {
    	return true;
    }
    
    /*
     *  toString() - return a printable display of
     *               the items in the queue.
     */
    
    public String toString()
    {
    	return "queue";
    }
}
