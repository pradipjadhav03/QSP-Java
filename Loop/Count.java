class Count 
{
	public static void main(String[] args) 
	{
		int n = 12345;
		int count = 0;
		while (n > 0)
		{
			System.out.println(n%10);
			n = n/10;
			count++;

		}
			System.out.println("Count is = "+count);
	}
}
