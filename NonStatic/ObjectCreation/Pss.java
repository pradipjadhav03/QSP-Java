class Pss 
{
	int x = 50;

	public static void user(int a)
	{
		System.out.println(a);
		Pss b = new Pss();
		System.out.println(b.x);
	}

	public static void main(String[] args) 
	{
		user(10);
		System.out.println("Hello World!");
	}
}
