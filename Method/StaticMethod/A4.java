class A4 
{
	static double a;
	static double c;
	static String s;
	static
	{
		a=7.68;
		System.out.println("SB-1");
	}
	public static void add(double a,double c) 
	{
		System.out.println(a+c);	
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Start");
		add(a,c);
		System.out.println("Main End");

	}
	static 
	{
		s = "Topper Chaitanya";
		System.out.println(s);
		System.out.println("SB-2");
	}
	static 
	{
		c = 8.00;
		System.out.println("SB-3");
	}
}
