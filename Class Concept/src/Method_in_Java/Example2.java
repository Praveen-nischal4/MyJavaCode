// methods in java which is called by object of class is called instance method.
//example below demonstrate 


package Method_in_Java;

import java.util.Scanner;

public class Example2 {

	int age;
	Scanner sn = new Scanner(System.in);
	
	public int checkAge()              //method with return type but no parameters
	{
		System.out.println("Please enter your age");
		age =sn.nextInt();
		
		if(age >=18)
		{
			System.out.println("Eligible for voting");
		}else
		{
			System.out.println("Not eligible for voting");
		}
		return age;
	}
	
	public static void main(String[] args) {
		Example2 ex = new Example2();
		ex.checkAge();         //this checkAge() is instance method as i use object to call upon
		

	}

}
