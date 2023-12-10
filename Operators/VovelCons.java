class VovelCons 
{
	public static void main(String[] args) 
	{
		char ch = 'D';
		
		boolean upper = (ch>='A' && ch<='Z');
		ch = (upper)?((char)(ch+32)):ch;

		System.out.println(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='o'); 
	}
}
