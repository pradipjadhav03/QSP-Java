class Pattern1 
{
	public static void main(String[] args) 
	{
		for (int i = 1;i<=5 ;i++ )
		{
			for (int j=1;j<10 ;j++ )
			{
				if ((i+j)>=6 && (j-i)<=4)
				{
					System.out.print(i);
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
