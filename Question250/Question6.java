//Write a program to check given number is divisible by 3 & 7
import java.util.Scanner;
class Question6 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num%3==0 && num%7==0)
		{
			System.out.println("Number is divisible by 3 & 7");
		}
		else{
			System.out.println("Number is not divisible by 3 & 7");
			}
	}
}
