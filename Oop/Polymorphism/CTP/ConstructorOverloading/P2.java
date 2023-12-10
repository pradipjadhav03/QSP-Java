class P2 
{
	P2()
	{
		System.out.println("No args Constructor");
	}

	P2(int a)
	{
		System.out.println(" int type Constructor");
	}

	P2(String s)
	{
		System.out.println("String type Constructor");
	}

	P2(double d)
	{
		System.out.println("double type Constructor");
	}

	public static void main(String[] args) 
	{
		System.out.println("Main () Start");
		P2 p = new P2(7.68);

	}
}
