//WAP to check if number is Positive or Negative
import java.util.Scanner;
class Question8 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num > 0)
		{
			System.out.println(num +" is a Positive Number");
		}
		else{
				System.out.println(num +" is a Negative Number");
			}
	}
}
