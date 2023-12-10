class Factors 
{
	public static void main(String[] args) 
	{
		int n = 12;
		int f = 1;
		while (f<=n)
		{
			if (n%f==0)
			{
				System.out.println(f);
			}
			f++;
		}
		
	}
}
/*1
2
3
4
6
12/*