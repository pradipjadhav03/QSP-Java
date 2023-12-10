class P1 
{
	public static void m1()
	{
		System.out.println("m1 () type");
	}

	public static void m1(int a)
	{
		System.out.println("m1 (int) type");
	}

	public static void m1(String s)
	{
		System.out.println("m1 (String) type");
	}

	public static void m1(boolean b)
	{
		System.out.println("m1 (boolean) type");
	}

	public static void main(String[] args) 
	{
		System.out.println("Main () Start");
		m1(true);
	}
}
