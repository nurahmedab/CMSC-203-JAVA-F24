package application;

public class Customer 
{
	// Instance variables
	private String name;
	private int age;
	
	/**
	 * Customer constructor
	 * @param name name of customer
	 * @param age age of customer
	 */
	public Customer(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	/**
	 * Copy customer constructor
	 * @param c of type Customer
	 */
	public Customer(Customer c)
	{
		name = c.name;
		age = c.age;
	}
	
	/**
	 * Returns age of customer
	 * @return int age of customer
	 */
	public int getAge()
	{
		return age;
	}
	
	/**
	 * Set age method
	 * @param age is passed
	 */
	public void setAge(int age)
	{
		this.age = age;
	}
	
	/**
	 * Returns name of customer
	 * @return string
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Set name method
	 * @param name is passed
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Returns string concantenation 
	 * @return String
	 */
	@Override
	public String toString()
	{
		return "Name: " + name + ", Age: " + age; 
	}
}