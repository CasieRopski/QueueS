/*
 *    class QueueCircTest - a program to test a circular
 *                          queue implementation.
 */


public class QueueCircTest {

	
	public static void main(String[] args) 
	{
		QueueCirc<Integer> q = new QueueCirc<Integer>();
		Integer n = null;
		
		
		// Check if the queue is empty.
		
		if (q.isEmpty())
			System.out.println("The queue is EMPTY");
		else
			System.out.println("The queue is NOT EMPTY");
		
		// Check if the queue is full.
		
		if (q.isFull())
			System.out.println("The queue is FULL");
		else
			System.out.println("The queue is NOT FULL");
		
		System.out.println("Entering an integer into the queue");
		
		q.enqueue(3);
		
        n = q.front();  // Get the front
        
        if (n == null)
        	System.out.println("ERROR - front() returned null");
        else
		    System.out.printf("%d is at the front of the queue\n", n);
		
		if (q.isEmpty())
			System.out.println("The queue is EMPTY");
		else
			System.out.println("The queue is NOT EMPTY");
		
		System.out.println("Removing an integer from the queue");

		n = q.dequeue();
	       
        if (n == null)
        	System.out.println("ERROR - dequeue() returned null");
        else
		    System.out.printf("%d is at the front of the queue\n", n);
		
		if (q.isEmpty())
			System.out.println("The queue is EMPTY");
		else
			System.out.println("The queue is NOT EMPTY");
		
		// Populate the queue
		
		for (int i = 0; i <= 15; i++)
			q.enqueue(i);
			
        for (int i = 0; i <= 8; i++) {
            n = q.dequeue();
            System.out.printf("dequeued: %d\n",n);
        }
        
        System.out.println("Queue should contain 9 thorugh 15");
        
        System.out.println(q.toString());  // Queue should contain 9,10,11,12,13,14,15
        
        for (int i = 16; i <= 25; i++)
             q.enqueue(i);
        
        System.out.println("Queue should contain 9 through 25");
      
        System.out.println(q.toString());  // Queue should contain 9 through 25
		             
		
        
        for (int i = 0; i <= 100; i++)
            q.enqueue(i);       
        

		System.out.println("\nThe queue should be full at this point");
		
		if (q.isEmpty())
			System.out.println("The queue is EMPTY");
		else
			System.out.println("The queue is NOT EMPTY");
		
		// Check if the queue is full.
		
		if (q.isFull())
			System.out.println("The queue is FULL\n");
		else
			System.out.println("The queue is NOT FULL\n");
	
		// Empty out the queue
		
		for (int i = 0; i <= 25; i++){
			System.out.println(q.toString());
		}
		
		while (!q.isEmpty()) {
			n = q.dequeue();
			if (n == null)
				System.out.println("ERROR - queue should not be empty");
			else
				System.out.printf("dequeue: %d\n", n);	
		}
		
		
		for (int i = 1; i <= 10; i++)
			q.enqueue(i);
		
		n = q.dequeue();
		n = q.dequeue();
		n = q.dequeue();
		
		System.out.println("\nThe queue should contain the numbers 4,5,6,7,8,9,10");
		
		System.out.println(q.toString());
		
	}

}
