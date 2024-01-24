// Method Overriding :- Method is said to be overridden if child class redefines the method of 

//parent class provided that method arguments i.e signature and type is same.

/* A method is said to be overridden if a child class redefines a method of the parent class,
provided that the method's signature (including the method name, number,and types of parameters,
  and return type) is the same in both the parent and child classes. */

// method overriding is a way of achieving polymorphism

package OPPsTechnique;

class Student
{
	protected int rollno;
	protected String name;
	protected String address;
	protected String dob;
	
	
	Student()
	{
		this.rollno =4;
		this.name="Rituraj";
		this.address ="Noida";
		this.dob ="2 March 1992";
	}
	
	Student(int rno,String nm,String add,String db)
	{
		this.rollno=rno;
		this.name =nm;
		this.address =add;
		this.dob=db;
	}
	
	protected void studentDetail()
	{
		System.out.println("Rollno : ="+this.rollno);
		System.out.println("Name : ="+this.name);
		System.out.println(" Address : ="+this.address);
		System.out.println("Dob : ="+this.dob);
	}
}

class Result extends Student
{
	private int marks1;
	private int marks2;
	private int marks3;
	
	Result()
	{
		super();
		this.marks1=89;
		this.marks2=75;
		this.marks3=78;
		
	}
	Result(int rn,String nm2,String adds,String db,int m1,int m2,int m3)
	{
		super(rn,nm2,adds,db);
		this.marks1=m1;
		this.marks2=m2;
		this.marks3=m3;
	}
	
	public void studentDetail()
	{
		double total =marks1+marks2+marks3;
		double per = (total *100 )/300;
		
		System.out.println(" Name :"+this.name);
		System.out.println("Roll no : "+this.rollno);
		System.out.println("Dob : "+this.dob);
		System.out.println("Percentage : ="+per);
	}
}


public class Prog2 {

	public static void main(String[] args) {
		
		Result res = new Result();
		res.studentDetail();
		
		Student res1 = new Result(55,"Rihan","Mumbai","4 June 2000",89,93,92);
		res1.studentDetail();
	}

}
