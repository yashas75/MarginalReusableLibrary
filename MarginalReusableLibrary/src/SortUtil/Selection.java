/**
 * 
 */
package SortUtil;

/**
 * @author I306977
 *
 */
public class Selection  {
	

	public static void sort(Comparable[] item)
	{
		
		int min;
		
		for ( int i = 0; i < item.length ; i++ )
		{
			
			min = i;
			
			for ( int j = i+1 ; j < item.length ; j++ )
			{
				
				if(less( item[j] , item[min] ))
				{
					min = j;
				}
				
				
			}
			
			exchange(item, i, min);
			
		}
		
		
	}
	
	
	private static boolean  less( Comparable v, Comparable w)
	{
		
		return v.compareTo(w) < 0;
		
	}
	
	private static void  exchange( Comparable[] item, int i, int j )
	{
		
		Comparable temp = item[i];
		
		item[i] = item[j];
		
		item[j] = temp;
	
	}
	

}
