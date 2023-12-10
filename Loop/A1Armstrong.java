import java.util.Scanner;
//Armstrong Program
class A1Armstrong 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count = 0,sum = 0;

		for (int copy=num;copy>0 ; copy=copy/10)
		{
			int rem = copy % 10;
			int power = 1;
			for (int i = 1;i<=count ;i++ )
			{
				power = power * rem;
			}
			sum = sum + power;
		}
		if (sum==num)
		{
			System.out.println(num+ " is a Armstrong Number");
		}
		else
		{
			System.out.println(num+ " is Not a Armstrong Number");
		}


	}
}
