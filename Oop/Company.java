class Company 
{
	public static void main(String[] args) 
	{
		Employee e = new Employee(50000);
		
		System.out.println(e.getSalary());
		e.setSalary(100000);
		System.out.println(e.getSalary());

	}
}
