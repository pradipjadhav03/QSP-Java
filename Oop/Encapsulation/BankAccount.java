class BankAccount 
{
	long acNo;
	String name;
	private double balance;

	BankAccount(long acNo,String name,double balance)
	{
		this.acNo = acNo;
		this.name = name;
		this.balance = balance;
	}

	public double getchaitanya()
	{
	    return this.balance;
	}
	
}
