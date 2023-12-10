import java.util.Scanner;
class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),copy = n,sum = 0,flag = n;

		int count = 0;
		while (n>0)
		{
			count++;
			n = n/10;
		}
		while (copy>0)
		{
			int rem = copy % 10;
			int power = 1;
		
		for (int i = 1;i<=count;i++)
		{
			power = power * rem;
		}
		sum = sum = power;
		copy = copy/10;
		}
		if (sum==flag)
		{
			System.out.println(flag+" Is an Armstrong Number");
		}
		else
		{
			System.out.println(flag+" Is Not an Armsrong Number");
		}

	}
}
