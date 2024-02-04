//local class implementation using anyonymous class 

package Anonymousclass;

public class Student {
	
	public void display()
	{
		interface Vehicle
		{
			void speed();
		}
		
	//	class Car implements Vehicle
    Vehicle v	= new Vehicle()         // means class is created at line and its reference is stored in Parent class Vehicle
		{
			public void speed()
			{
				System.out.println("Car speed is greater than threshold");
			}
		};
		
		//Car c  = new Car();
		//c.speed();
		v.speed();
	}

	public static void main(String[] args) {
		
		Student s = new Student();
		s.display();
	}

}
