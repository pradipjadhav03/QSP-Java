class A1 
{
	public static int a = 20;
	static int b = 30;
	
	static{
			System.out.println("Static Block");
		  }
	public static void main(String[] args) 
	{
		int a = 10;
		System.out.println(A1.a);
		System.out.println(a);
	}
		


}
