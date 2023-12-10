class P1 
{
	int a = 10;

	{
		System.out.println("NSB-1");
	}

    public void demo()
	{
		System.out.println("Non static Method");
	}

	public static void main(String[] args) 
	{
		P1 n = new P1();
		System.out.println(n.a);
		P1.demo();
	}
}
