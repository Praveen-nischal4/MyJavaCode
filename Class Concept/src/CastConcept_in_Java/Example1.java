// if we use parent class refernce to refer child class object then programmer will get only 50%
// visibility, he has option of either call overridden methid of super class in sub class 
// or just call only super class methods only but not possible to call child class method 

//Program below demonstrate this fact :

package CastConcept_in_Java;

class One
{
	protected int x;
	
	One()
	{
		this.x=5;
	}
	public void myDisplay()
	{
		System.out.println("This is super class method ");
	}
	
	public void getSqaure()
	{
		System.out.println("Square of a number is : ="+x*x);
	}
}

class Two extends One
{
	int y;
	
	Two()
	{
		this.y=7;
	}
	public void myDisplay()
	{
		System.out.println("This is overridden method of super class in sub class also both class have instance variable"); 
		System.out.println(" instance varibale of class One :"+this.x+" \t"+" Instance variable of class Two :"+this.y);
		
	}
	
	public void getCube()
	{
		System.out.println("Cube of a number  : ="+y*y*y);
	}
}

public class Example1 {

	public static void main(String[] args) {
		
		One o;
		o= (One) new Two();
		
		//One o = new Two();        // Since we use widening i.e. type cast from sub class to super class so no cast operator is needed
		
		o.myDisplay();
       	o.getSqaure();	 // can call super class methods 
        // o.getCube(); // but not chidl class methods 
	}

}
