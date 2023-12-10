class MaxOf3 
{
	public static void main(String[] args) 
	{
		int a = 20;
		int b = 50;
		int c = 80;
		int max = (a>b)? (a>c ? a:c) :(b>c ? b :c);
		System.out.println(max);
	}
}
