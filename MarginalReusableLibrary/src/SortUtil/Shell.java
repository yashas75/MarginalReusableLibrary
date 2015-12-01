package SortUtil;

public class Shell {
	
	public static void sort(Comparable[] item)
	{
		
		int N = item.length;
		
		int h = 1;
		
		while( h < N/3 )
		{
			
			h = h * 3 + 1; 
			
		}
		
		while ( h >= 1 )
		{
			
			for( int i = h ; i < N ; i += h )
			{
				
				for ( int j = i ; j >= h && less (item[j] , item[j-h] ); j -= h )
				{
					
						exchange(item, j, j - h);
					
				}
				 
			}
			
			h = h/3;
			
		}
		
	}
	
	private static boolean less ( Comparable v, Comparable w)
	{
		
		return v.compareTo(w) < 0 ;
		
	}
	
	private static void exchange( Comparable[] item, int i , int j )
	{
		
		Comparable temp = item[i];
		
		item[i] = item[j];
		
		item[j] = temp;
		
	}

}
