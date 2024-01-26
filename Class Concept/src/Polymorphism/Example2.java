// final method can't be overridden
// here only overloading is possible
//Below program demonstrate this :


package Polymorphism;

public class Example2 {

	String name;
	int rollno;
	
	Example2()
	{
		this.name="Shona";
		this.rollno =5;
	}
	
	final  public void stuDetail()
	{
		System.out.println("Name ="+this.name);
	}
	
}

class B extends Example2
	{
	
		public void stuDetail(String city)
		{
			System.out.println("Student name & Rollno : ="+this.rollno+"\t "+this.name+"\t"+city);
		}
	
	public static void main(String[] args) {
		
		/*
		 * Example2 b1 = new B(); b1.stuDetail("Indian");
		 */
		 
		B b1= new B();
		b1.stuDetail("Mumbai");
	}

}
