//Take an input as age number from user and check weather he is eligible for marriage or not 
import java.util.Scanner;
class Question4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age >= 21)
		{
			System.out.println("Eligible for Marriage");
		}
		else{
				System.out.println("Not Eligible for Marriage");
			}

	}
}
