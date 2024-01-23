// If in parent class there is a default constructor then it will be called first 
// after that it called parameterized constructor
// case 2: If parent class have both type of constructor then how inheritance is done
// Note: if you want to deal constructor within same class then use this 
// if multiple constructor from parent then use super 


package InheritenceConcept;

class Person
{
	protected int pid;
	protected String name;
	protected String address;
	protected String mobile;
	
	Person()
	{
		this.pid =5;
		this.name ="Rajesh";
		this.address ="754,Dehradun";
		this.mobile ="9943234521";
		
	}
	
	Person(int pd,String n, String ad,String mb)
	{
		
		this.pid =pd;
		this.name=n;
		this.address=ad;
		this.mobile=mb;
	}
	
	protected void myDetail()
	{
		System.out.println("Person Id :"+this.pid);
		System.out.println("Name : "+this.name);
		System.out.println("Address :"+this.address);
		System.out.println("Mobile No : "+this.mobile);
		System.out.println();
	}
	
}

class Employee extends Person
{
	private int empid;
	private String dept;
	
	Employee()
	{
		super();
		this.empid =100;
		this.dept ="Sales";
	}
	
	Employee(int pdd,String nme,String add,String mbl,int eid,String dt)
	{
		super(pdd,nme,add,mbl);
		this.empid =eid;
		this.dept =dt;
	}
	
	public void printEmployeeDetails()
	{
		super.myDetail();
		System.out.println(" Employee id :"+this.empid);
		System.out.println("Department : "+this.dept);
	}
}

public class Prog3 {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.printEmployeeDetails();
		
		System.out.println("Parameterized Constructor values");
		System.out.println();
		
		Employee emp2 = new Employee(1,"Suraj Singh","Delhi","8081973321",200,"MArketing");
		emp2.printEmployeeDetails();
	}

}
