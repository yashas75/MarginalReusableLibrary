package linkedStack;

import java.util.Iterator;


public class LinkedStackNodeIterator<Object> implements Iterable<Object> {
	
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



	@Override
	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		
		return new StackIterator();
		
	}
	
	
	private class StackIterator implements Iterator<Object>
	{

		Node current = first ;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			
			return current != null ;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			
			if ( current != null)
			{
				Object item = current.item;
				
				current = current.node;
				
				return item;
			}
			
			return null;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}
		
	}

}
