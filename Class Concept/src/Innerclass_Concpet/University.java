//Static Nested classes called Static inner class
//whereas non static nested class is called inner class
// to access inner class either static or non-static you must have to create object of outer class first then 
//object of inner class
//Example below will demonstrate this



package Innerclass_Concpet;

public class University 
{
	private String name;
	private int liscenceno;
	private String address;
    private String affiliatedTo; 	
	
    University(String n ,int lno,String add,String afT){
    	this.name=n;
    	this.liscenceno=lno;
    	this.address=add;
    	this.affiliatedTo=afT;
    }
    
    class Student
    {
    	private int regno;
    	private int rollno;
    	private String stream;
    	
    	Student(int rgn,int rn,String st)
    	{
    		this.regno=rgn;
    		this.rollno=rn;
    		this.stream=st;
    	}
    	
    	public void FullDetails() {
    		UniversityRecord();
    		System.out.println("Registration No : "+this.regno);
    		System.out.println("Rollno : "+this.rollno);
    		System.out.println("Stream : "+this.stream);
    		
    	}
    }
    
    public void UniversityRecord()
    {
    	System.out.println("Name of University :"+this.name);
    	System.out.println("Liscence No : "+this.liscenceno);
    	System.out.println("Address : "+this.address);
    	System.out.println("Affilated To  : "+this.affiliatedTo); 
    }
    
	

	public static void main(String[] args) {
		
		University u = new University("UPTU",2563,"Lucknow","AICTE");
		University.Student s = u.new Student(45678,23,"CS");
		s.FullDetails();

	}

}
