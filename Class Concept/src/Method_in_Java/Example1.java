// method() in java

package Method_in_Java;

import java.util.Scanner;

public class Example1 {

	int num1,num2,res=0;
	
	Scanner sn = new Scanner(System.in);	
	public void sum()
	{
		System.out.println("Enter your first number ");
		num1 =sn.nextInt();
		System.out.println("Enter scond number :");
		num2 = sn.nextInt();
		res =num1+num2;
		System.out.println("Addition of two number is =:"+this.res);
	}
	
	
	public int Addition()
	{
		int c=5,d=44;
		return c+d;
	}
	
	public double Subtraction(double a,double b)
	{
		return a-b;
	}
	public static void main(String[] args) {

		Example1 c= new Example1();
		c.sum();
        System.out.println(" Method with return type ="+c.Addition());

        System.out.println(" Return type method with argument "+c.Subtraction(45.23-28.145, 0));
	}

}
