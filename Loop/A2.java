// check How number of 0 are present
class A2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int nu = sc.nectInt();
		int count =0;
		while (nu>0)
		{
			int rem = nu % 10;
			if (rem==0)
			{
				count++;
			}
			nu = nu / 10;
		}

		System.out.println("Hello World!");
	}
}
