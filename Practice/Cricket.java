class Cricket extends Sport 
{
	int noOfPlayers = 11;
	public static void main(String[] args) 
	{
		Sport s = new Sport();
		System.out.println(s.noOfPlayers);

		Cricket c = (Cricket)s;
		System.out.println(s.noOfPlayers);

		System.out.println("Hello World!");
	}
}
