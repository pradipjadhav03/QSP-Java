import java.util.Scanner;
class A1 
{
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int sub(int a,int b)
	{
		return a-b;
	}
	public static int mul(int a,int b)
	{
		return a*b;
	}
	public static int div(int a,int b)
	{
		return a/b;
	}
	public static int mod(int a,int b)
	{
		return a%b;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		char op = sc.next().charAt(0);
		int b = sc.nextInt();

		int res = 0;

		while(true)
		{
			switch (op)
			{
			case '+' :
				{
					res = add(a,b);
					break;
				}
			case '-' :
				{
					res = sub(a,b);
					break;
				}
			case '*' :
				{
					res = mul(a,b);
					break;
				}
			case '/' :
				{
					res = div(a,b);
					break;
				}
			case '%' :
				{
					res = mod(a,b);
					break;
				}
			default :
					System.out.println("Invalid Op");
			
			}
			op = sc.next().charAt(0);
			if (op == '=')
			{
				break;
				
			}
			a = res;
			b = sc.nextInt();
			
		}
			System.out.println(res);
		
	}
}
 