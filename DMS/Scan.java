import java.util.Scanner;
class Scan 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter First Number");
		int a = scanner.nextInt();

		System.out.println("Enter Operator");
		char x = scanner.next().charAt(0);

		System.out.println("Enter Second Number");
		int b = scanner.nextInt();

		switch (x)
		{
		case '+':{
				System.out.println(a+b);
				}
		case '-':{
				System.out.println(a-b);
				}
		case '*':{
				System.out.println(a*b);
				}
		case '/':{
				System.out.println(a/b);
				}
		case '%':{
				System.out.println(a%b);
				}
		
		}

		System.out.println("Hello World!");
	}
}
