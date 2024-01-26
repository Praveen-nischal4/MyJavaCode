// If the narrrowing is done using sub-class object then all method of both the class will be accessible 
//Narrowing refers to, casting an object of a broader type to a more specific (usually subclass) type.


package CastConcept_in_Java;

class Manager
{
	protected int id;
	protected String name;
	protected boolean isManager;
	Manager()
	{
		this.id =7;
		this.name ="Suraj Singh";
		this.isManager=false;
	}
	
	Manager(int id,String nm,boolean isMn)
	{
		this.id=id;
		this.name=nm;
		this.isManager =isMn;
	}
	
	public void mDetails()
	{
		System.out.println("This is Maanger Details :");
		System.out.println(" Name : ="+this.name);
		System.out.println("ID : "+this.id);
	}
	
	public void isManager()         //method of super class
	{
		 if(isManager)
		 {
			 System.out.println(" Manager is here");
		 }else
		 {
			 System.out.println("Your are not a Maanger");
		 }
	}
}

class Employee extends Manager
{
	private String dept;
	private double salary;
	
	Employee()
	{
		super();
		this.dept= "MArketing";
		this.salary =4575.433;
	}
	
	Employee(int id,String nm,String dpt,double sal)
	{
		super();
		this.dept=dpt;
		this.salary =sal;
	}
	
	public void mDetails()            //overridden method of super class in sub class
	{
		System.out.println("This is Employee Details :");
		System.out.println(" Name : ="+this.name);
		System.out.println("ID : "+this.id);
		System.out.println("Department  : "+this.dept);
		System.out.println();
	}
	
	public void isEmployee()           //child class method
	{
		if(this.isManager == false)
		{
			System.out.println("You are Employee with salary : "+this.salary);
		}
	}
}


public class Example2 {

	public static void main(String[] args) {
		
		// If you have child class refernce of parent  type then you can access overridden methods 
		// of parent class in child class or you can access method of parent class but not child class
		
		Manager Employee = (Manager) new Employee();
		Employee.mDetails();
		Employee.isManager();

		// if there is a narrowing with object f super class then u cannnot access any of the method of 
		// super class or sub class
		
		/*
		 * // Employee Emp ; // Emp = (Employee)new Manager(); // Emp.isEmployee(); //
		 * Emp.isManager();
		 */
		
		// if there is a narrowing of sub class object then u can access method of both class
		
		Manager m=(Manager) new Employee();
		Employee e=(Employee)m;
		e.isManager();
		e.isEmployee();
	}

}
