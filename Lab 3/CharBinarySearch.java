public class CharBinarySearch
{
	public static int binarySearch(char[] c,char x)
	{	
		
		int midPoint;
		int lowerBound=0;
		int upperBound=c.length-1;
		while(lowerBound<=upperBound)
		{
			midPoint=(lowerBound+upperBound)/2;
			if(c[midPoint]<x)
			{
					lowerBound=midPoint+1;
			}
			else
			if(c[midPoint]>x)
			{
					lowerBound=midPoint-1;
			}			
			else
				return midPoint;
	
		}
			return -1;
	}

	public static void main(String[] args) 
	{
		char[] c={'A','B','C','D','E','F','G','H','I'};	
		char x='E';
		System.out.println("Character at index:"+ binarySearch(c,x));
	}
}