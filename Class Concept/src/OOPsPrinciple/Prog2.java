package OOPsPrinciple;

import java.util.Scanner;

class Employee
{
	private int empid;
	private String ename;
	private String dept;
	
	Scanner sn = new Scanner(System.in);
	Employee()
	{
		this.empid =4;
		this.ename ="Suraj";
		this.dept ="Sales";
	}
	
	
	Employee(int ed,String nm,String dt){
		this.empid =ed;
		this.ename =nm;
		this.dept =dt;
	}
	public void Display()
	{
		System.out.println(this.empid);
		System.out.println(this.ename);
		System.out.println(this.dept);
		System.out.println();
	}
	
}
public class Prog2 {

	public static void main(String[] args)
	{
		
		Employee emp = new Employee();
		emp.Display();

		Employee emp1 = new Employee(5,"Deepak","MArketing");
		emp1.Display();
		// Reference or Array of Obj
		
		Employee [] ep = new Employee[2];
		
		//adding reference of object value method1
        ep[0] = new Employee(7,"Nalin","Production");
        ep[0].Display();
        
        ep[1] = new Employee(8,"Nancy","Programmer");
        ep[1].Display();
	}

}
