package SortUtil;

public class Insertion {
	
	public static void sort(Comparable[] item)
	{
		
		
		for (int i = 0; i < item.length ; i ++)
		{
			
			for( int j = i ; j > 0 ; j -- )
			{
				
				if ( less(item[j] , item[j-1]) )
				{
					
					exchange(item, j, j-1);
					
				}
				
			}
			
		}
		
	}
	
	private static boolean less ( Comparable v, Comparable w)
	{
		
		return v.compareTo(w) < 0 ;
		
	}
	
	private static void exchange ( Comparable[] item , int i , int j)
	{
		
		Comparable temp = item[i];
		
		item[i] = item[j];
		
		item[j] = temp;
 		
	}

}
