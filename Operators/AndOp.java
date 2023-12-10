class AndOp 
{
	public static void main(String[] args) 
	{
		String s = "java";
		String c = "java";
		String n = "Python";

		boolean b = (!(s==c) && (s==n));
		System.out.println(b);
	}
}
