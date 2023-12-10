class BullDog extends Dog 
{
	public void aggression()
	{
		System.out.println("BullDogs are Aggresive in Nature");
	}

	public static void main(String[] args) 
	{
		BullDog b = new BullDog();
		b.aggression();
		b.loyal();
		b.sound();

		Dog d = new Dog ();
		d.loyal();
		d.sound();
		d.aggression();
	}
}
