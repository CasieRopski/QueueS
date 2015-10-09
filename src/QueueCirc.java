/* 
 *   class QueueCirc
 *   
 *   A Circular Implementation of the generic QueueInterface.
 */

public class QueueCirc<T> implements QueueInterface<T>
{
	private int front = 0;   // Index of the front item in the queue.
	private int rear = -1;   // Index of the rear item in the queue.
	
	T[] A = (T[]) new Object[20];  // Generic arrays cannot be constructed in Java.
	                               // A solution is to create an array of Object
	                               // and type cast as an array of a generic type.
	                               // Ignore any warnings the compiler generates.
	/*
	 *    The Queue constructor.
	 */
	
	public QueueCirc()
	{
		
	}

	/*
	 *    enqueue() - add an item to the rear of the queue.
	 *                Do nothing if the queue is full.
	 */
	
	public void enqueue(T item)
	{
		if (!isFull()){			//Checks if it's full		
			rear++;				//Increment rear
			
			if (rear == A.length-1){ //Checks if rear is now in last
				rear = 0; 	   	//array position, sets it to the next
			}					//section, which is one.
				
			A[rear]=item;		//Set item into new rear position.
		}
		
	}
	
    /*
     *   dequeue() - delete and return the front item
     *               in the queue. Return null if 
     *               the queue is empty.
     */
	
	public T dequeue()		
	{
		//cannot dequeue if array is empty.
		if (isEmpty()==true){
			System.out.println("The queue is empty");
			return null;
		}
		
		T tempFront = A[front]; 
		
		if (front == A.length-1){
			front = 0;
		}
		else {front++;} //increment front
		
		return tempFront;//print new front value

	}
	
	/*
	 *    front() - Return (but do not delete) the item
	 *              at the front of the queue.
	 */
	
    public T front()
    {
    	return A[front]; //return front item
    }
    
    /*
     *    isEmpty() - returns true if the queue is empty 
     *                else returns false.
     */
    
    public boolean isEmpty()
    {
    	//If front is greater than rear by one, it is empty
        int tempRear = rear;
        
       	if (tempRear == A.length-1){
       		
       		tempRear = 0;
       		
       		if (front == tempRear){
       			return true;
       		}
        }
       	
        if ((front) == rear+1) {
       		return true; 
       	}
        	
        return false;
    }
    
    /*
     *    isFull() - returns true if the queue is empty 
     *               else returns false.
     */
    
    public boolean isFull()
    {
    	int tempRear = rear;
   		
    	if (tempRear == A.length-1){
    		tempRear=0;
   		} else {
   			tempRear++;
   		}
    	
   		if (tempRear == A.length-1){
    		tempRear=0;
   		} else {
   			tempRear++;
   		}
   		
   		if (front == tempRear) {
	    	return true;
	    }
   		
    	return false;
    }
    
    /*
     *  toString() - return a printable display of
     *               the items in the queue.
     */
    
    public String toString()
    {
    	String result = "Array is empty";
    	String value = "";
    	
    	if (isEmpty()){		//If array is empty, return 
    		return result;	//a statement saying that.
    	}
    	
    	int tempFront = front;
       	boolean done = false;
       	
       	//Runs through circular array and  prints values.
       	while (done!=true){
    		
       		if (tempFront == A.length-1){
    			tempFront=0;
    			value += A[tempFront] + ",";
    		} else {
    			value += A[tempFront] + ",";
    		}
    		
    		if (tempFront == rear){ //has gone through entire array
    			done = true;
    		}
    		
    		tempFront++;
    	}
    	return value;
    }
}
