public class StringLinearSearch
{
	public static int linearSearch(String[] s,String x)
	{
		for(int i=0;i<s.length;i++)
		{
			if(s[i]==x)
			{
				return i;
			}
		}
			return -1;
	}

	public static void main(String[] args) 
	{
		String[] s={"Smith","Adams","Abel","Baker","Jack","Hugo","Anne"};
		System.out.println("String Found at :"+linearSearch(s,"Adams"));	
	}
}