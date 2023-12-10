class Animal 
{
	String sound;

	Animal(String sound)
	{
		this.sound = sound;	
	}

	public void makingNoise()
	{
		System.out.println(this.sound);
	}

	public static void main(String[] args) 
	{
		Animal dog = new Animal("Bhow bhow");
		Animal cat = new Animal("Meow Meow");

		dog.makingNoise();
		cat.makingNoise();
	}
}
