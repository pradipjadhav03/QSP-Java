class P1 
{
	public static void main(String[] args) 
	{
		int n = 5;
		for (int r = 1;r<=n ;r++ )
		{
			int v = 1,x = 0;
			for (int c = 1;c<2*n ;c++ )
			{
				if (c<=n && r+c >=6)
				{
					System.out.print(v);
					x = v;
					v = v*2;
				}
				else if (c>n && (c-r)<=4)
				{
					x = x/2;
					System.out.print(x);
					
				}
				else
				{
					System.out.print(" ");
				}
			}
					System.out.println();
		}


	}
}
