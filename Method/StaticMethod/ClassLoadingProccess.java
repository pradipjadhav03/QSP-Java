class ClassLoadingProccess 
{
	static int a;
	static int b;
	static
	{
		a =12;
		System.out.println("SB-1");
	}
	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void pro(int a,int b)
	{
		System.out.println(a*b);
	}

	public static void main(String[] args) 
	{
		add(a,b);
		pro(a,b);
	}
	static
	{
		b = 2;
		System.out.println("SB-2");
	}
}
/*op:-  SB-1
		SB-2
		14
		24