// demo to override toString method of class

package Polymorphism;

class MyLaptop
{
	private String brand;
	private double memory;
	
	MyLaptop()
	{
		this.brand ="Dell";
		this.memory =1023.56;
	}
	
	public String toString()
	{
		return this.brand+" "+this.memory;
		
	}
}


public class Demo {

	public static void main(String[] args) {
	
		MyLaptop ml = new MyLaptop();
			System.out.println(ml.toString());

	}
	
}

