import java.util.Scanner;
class XylemPhloem 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int copy = num;
		int esum = num%10;
		int isum = 0;

		num = num/10;

		while (num>9)
		{
			isum = isum + (num%10);
			num  = num /10;
		}
		esum = esum + num;
		if (esum==isum)
		{
			System.out.println(copy + " is a Xylem number");
		}
		else
		{
			System.out.println(copy + " is a Phloem Number");
		}

	}
}
