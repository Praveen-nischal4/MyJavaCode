package InterfaceConcept;

interface Employee
{
	int working_hour =8;
	
	abstract int getEmployeeID();
	abstract double getsalary();
	
	default int getincentive() {
		return 2500;
	}
}

class ParmanentEmployee implements Employee
{
    private int eid;
	private String name;
    private int basic;
    
    ParmanentEmployee()
    {
    	this.eid=5;
    	this.name ="Ravish Kumar";
    	this.basic=8000;
    }
	
    ParmanentEmployee(int id,String nm,int bs)
    {
    	this.eid=id;
    	this.name=nm;
    	this.basic=bs;
    	
    }
	
	@Override
	public int getEmployeeID() {
		
		return this.eid;
	}

	@Override
	public double getsalary() {
       double netsalary = this.basic* working_hour +getincentive();
		return netsalary;
	}
	
}
public class Demo {

	public static void main(String[] args) {
		ParmanentEmployee pe = new ParmanentEmployee(55,"Deepak Kumar",5000);
		System.out.println("Employee Id :"+pe.getEmployeeID());
		System.out.println(" Salary of Emplyee : "+pe.getsalary());
	}

}
