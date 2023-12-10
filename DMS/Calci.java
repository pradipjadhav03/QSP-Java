import java.util.Scanner;
class Calci 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1 = scanner.nextInt();
		System.out.println("Enter Operator");
		char ope = scanner.next().charAt(0);
		System.out.println("Enter Second Number");
		int num2 = scanner.nextInt();

		switch (ope)
		{
		case '+':{
					System.out.println(num1+num2);
				}
		case '-':{
					System.out.println(num1-num2);
				}
		case '*':{
					System.out.println(num1*num2);
				}
		case '/':{
					System.out.println(num1/num2);
				}
		case '%':{
					System.out.println(num1%num2);
				}
		}
	}
}
