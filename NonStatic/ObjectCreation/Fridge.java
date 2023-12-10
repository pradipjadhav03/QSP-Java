class Fridge 
{
	String season;

	Fridge(String season)
	{
		this.season = season;
	}

	public void cooling(String season)
	{
		switch (season)
		{
		case "summer" :
			System.out.println("High Cooling Level");
			break;

		case "monsoon" :
			System.out.println("Moderate Cooling Level");
			break;

		case "winter" :
			System.out.println(" Low Cooling Level");
			break;
		
		}
	}

	public static void main(String[] args) 
	{
		Fridge f = new Fridge("monsoon");
		f.cooling(f.season);
	}
}
