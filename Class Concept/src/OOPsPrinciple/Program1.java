package OOPsPrinciple;

import java.util.Scanner;

class Student
{
	private int rollno;
	private String name;
	private String email;
	
	Scanner sn = new Scanner(System.in);
	public void inputDetail()
	{
		System.out.println("Enter roll no");
		this.rollno = sn.nextInt();
		
		System.out.println("Enter your name");
		this.name =sn.next();
		
		System.out.println("Enter your email");
		this.email =sn.next();
		
	}
	
	
	public void getDetail()
	{
		System.out.println(this.rollno);
		System.out.println(this.name);
		System.out.println(this.email);
	}
}
public class Program1 {

	public static void main(String[] args) {
		Student s = new Student();
		s.inputDetail();
	    s.getDetail();
	}

}
