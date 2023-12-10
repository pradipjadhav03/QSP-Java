class P11 
{
	public static void main(String[] args) 
	{
		int x = 20;
		int res = ++x * 10 / x++;
		System.out.println(x);
		System.out.println(res);
	}
}
