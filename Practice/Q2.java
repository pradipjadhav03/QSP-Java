class Q2 
{
	static int a;
	static int b;
	static
		{
		a=10;
			System.out.println("SB1");
		}
		Q2()
	{
			System.out.println("Costructor");
	}
	{
		System.out.println("Non Static Block");
	}
	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) 
	{
		Q2 q = new Q2();
		add(a,b);
	}
	static
		{
			b=20;
			System.out.println("SB3");
		}
	
}
