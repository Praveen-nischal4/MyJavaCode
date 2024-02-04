//using an abstract method inside a method-local inner class and 
//then providing a concrete implementation using an anonymous inner class is a valid approach,

package Localclass;

public class Demo2 {

	void display()
	{
		abstract class Person
		{
			String name;
			int age;
			
			Person()
			{
				this.name="Suraj";
				this.age=20;
			}
			abstract void getDetail();
		}
		final class Student extends Person
		{

			@Override
			public void getDetail() {
			System.out.println(this.name);
			System.out.println(this.age);
				
			}
			
		}
		Student s= new Student();
		s.getDetail();
	}
	public static void main(String[] args) {
		
		Demo2 dd = new Demo2();
		dd.display();
	}

}
