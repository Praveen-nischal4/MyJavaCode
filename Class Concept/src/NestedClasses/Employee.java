package NestedClasses;

public class Employee {
	
	private int empid;
	private String ename;
	private String city;
	
	Employee(int eid,String en,String cty)
	{
		this.empid=eid;
		this.ename=en;
		this.city=cty;
	}
	
	public int getEmpID()
	{
		return this.empid;
	}
	
	public String getName()
	{
		return this.ename;
	}
	
	public String getCity()
	{
		return this.city;
	}
	
	
	class Dept
	{
		private int dept_id;
		private String dept_name;
		
		Dept(int did,String dnm)
		{
			this.dept_id=did;
			this.dept_name=dnm;
		}
		
		public void displayDept()
		{
			System.out.println("ID : "+this.dept_id);
			System.out.println("Name "+this.dept_name);
		}
		public void displayEmployee()
		{
			System.out.println("Display Emp id : "+getEmpID());
			System.out.println("Employee Name : "+getName());
			System.out.println("City : "+getCity());
		}

	}

	
	public static void main(String[] args) {
		Employee e = new Employee(4,"Dheraj","Delhi");
		
		Employee.Dept ed =e.new Dept(100,"Suman");
		
		ed.displayDept();
		ed.displayEmployee();
		

	}

}
