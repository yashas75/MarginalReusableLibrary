/**
 * 
 */
package linkedStack;

/**
 * @author Yashas75
 *
 */
public class LinkedStackNode {
	
	Node first = null ;
	
	
	/**
	 * @author Yashas75
	 *
	 */
	private class Node
	{
		
		Object item ;
		
		Node node ;
		
	}
	
	
	/**
	 * @return boolean
	 * return boolean value indicating status of the Stack
	 */
	public boolean isEmpty()
	{
		
		return first == null;
		
	}
	
	
	/**
	 * @param object
	 * Adds item to the stack
	 */
	public void pushItem( Object o )
	{
		
		Node node = new Node();
		
		node.item = o;
			
		node.node = first;
			
		first = node;		
		
	}
	
	
	/**
	 * Pops item out of the Stack
	 */
	public void popItem ()
	
	{
		
		if( first != null )
		
			first = first.node;		
		
	}
	
	
	/**
	 * @return int
	 * 
	 * returns count od the stack
	 */
	public int count()
	
	{
		
		Node temp = first ;
		
		int count = 0 ;
		
		if (temp  == null)			
			return 0;
		
		
		while ( temp != null )
		{
			count++;
			
			temp = temp.node; 
		}
		
		return count;
	}
	
	

}
