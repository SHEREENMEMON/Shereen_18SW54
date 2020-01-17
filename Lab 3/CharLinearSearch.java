public class CharLinearSearch
{
	public static int linearSearch(char[] c,char x)
	{
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==x)
			{
				return i;
			}
		}
			return -1;
	}

	public static void main(String[] args) 
	{
		char[] c={'a','b','c','d','e','f','g','h'};
		System.out.println("Character at index:"+ linearSearch(c,'e'));
		
	}
	
}