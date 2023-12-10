import java.util.Scanner;
class ArrFactorial 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] arr = new int[size];
		for (int i=0;i<arr.length ;i++ )
		{
			arr[i]=sc.nextInt();
		}

		for(int i = 0;i<arr.length;i++)
			{
				int fact =1;

				for (int j =1;j<=arr[i] ;j++ )
				{
					fact = fact*j;
				}

				System.out.println(fact);
		}
		
	}
}
