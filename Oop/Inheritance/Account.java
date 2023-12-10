class Account 
{
	long acNo;
	String acType;

	Account(long acNo,String acType)
	{
		this.acNo = acNo;
		this.acType = acType;
	}

	public void employee()
	{
		System.out.println("Non static method of Employee class");
	}

	{
		System.out.println("Non static block of Account class");
	}
	public static void main(String[] args) 
	{
		Account a = new Account(123456789123l,"Saving");
		Account b = new Account(123456789123l,"Current");

		System.out.println(this.acNo);
		System.out.println(this.acType);
		this.employee();
	}
}
