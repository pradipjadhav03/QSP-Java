class NumPattern4 
{
	public static void main(String[] args) 
	{
		int n = 5;
		int val = 1;
		for (int i = 1;i<=n ;i++ )
		{5u
			for (int j = 1;j<=n+(n/2) ;j++ )
			{
				if (n+2<=2*j+i && j<=(n/2)+1)
				{
					System.out.print("* ");
				}
				else if (2*(j-i)<=n && j>(n/2)+1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		
	}
}
