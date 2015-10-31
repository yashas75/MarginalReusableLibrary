package linkedStack;


public class LinkedStackArray {
	
	Object oArray[] ;
	
	int size;
	
	LinkedStackArray( int n )
	{
		
		oArray = new Object[ n ];
		
	}
	
	/**
	 * @return boolean
	 * return boolean value indicating status of the Stack
	 */
	public boolean isEmpty()
	{
		
		return size == 0;
		
	}
	
	
	/**
	 * @param object
	 * Adds item to the stack
	 */
	public void pushItem( Object o )
	{
		
		oArray[ size ++ ] = o;
		
	}
	
	
	/**
	 * Pops item out of the Stack
	 */
	public void popItem ()
	
	{
		
		oArray[ size ] = null;
		
		size--;
		
	}
	
	
	/**
	 * @return int
	 * 
	 * returns count od the stack
	 */
	public int count()
	
	{
		
		if ( size > 0 )
			return size;
		else 
			return 0;
		
	}
	

}
