class Vowel1 
{
	public static void main(String[] args) 
	{
		char ch = 'A';
		boolean upperV = ((ch>= 'A' && ch<= 'Z') && (ch=='A' || ch== 'E' || ch== 'I' || ch=='O' || ch=='U'));
		boolean lowerV = ((ch>= 'a' && ch<= 'z') && (ch=='a' || ch== 'e' || ch== 'i' || ch=='o' || ch=='u'));
		
		if (upperV)
		{
			System.out.println("Alpha");
		}
		else if (!upperV && (ch>= 'A' && ch <= 'Z'))
		{
			System.out.println("AlphaBita");
		}
		else if (lowerV)
		{
			System.out.println("AlphaGama");
		}
		else if (!lowerV && (ch>= 'a' && ch <= 'z'))
		{
			System.out.println("Lamda");
		}
		else 
			 System.out.println("Invalid");

	}
}
