/*
 *    class StackDemo - a program to test a
 *                      stack implementation.
 */
public class StackDemo 
{
	// Construct a stack of integers.

	private static Stack<Integer> s = new Stack<Integer>();
	

	public static void main(String[] args) 
	{
	    if (s.isEmpty())
	    	System.out.println("empty");
	    else
	    	System.out.println("not empty");
	    
	    s.push(3);
	    s.push(5);
	    s.push(7);
	    s.push(21);
	    
	    System.out.println(s.toString());
    
	    
	    if (s.isEmpty())
	    	System.out.println("empty");
	    else
	    	System.out.println("not empty");
	    
	    System.out.println(""+s.top());
	    System.out.println(""+s.top());
	    
	    System.out.println(""+s.pop());
	    System.out.println(""+s.pop());
	    System.out.println(""+s.pop());
	    System.out.println(""+s.pop());
	    
	    if (s.isEmpty())
	    	System.out.println("empty");
	    else
	    	System.out.println("not empty");
	    
	    System.out.println(s.toString());
	}

}
