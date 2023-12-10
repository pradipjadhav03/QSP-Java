class Average 
{
	public static void main(String[] args) 
	{
		int a = 1;
		int b = 100;
		int count = 0;
		int sum = 0;
		while (a>=b)
		{
			sum = sum+a;
			count++;
			a++;
		}
		System.out.println(sum/count);
	}
}
