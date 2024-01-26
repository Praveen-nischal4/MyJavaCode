//Abstract class only used as'super' classs
//Abstract class have abstract method as well as non-abstract().
//Abstract method don't have body, and only overridden in derived class which is not abstract.
// Abstract class overridden method should have same signature as that of Super class
//Abstract method only created in abstract class.
//Abstract class & methods() cannnot be final.
// Last but not least we cannot create object of abstract class but we can create reference of abstract class.



package AbstractConcept;

abstract class Vehicle
{
  protected int vid;
  
  Vehicle()
  {
	  this.vid =4;
  }
  
  Vehicle(int id)
  {
	  this.vid=id;
  }
  
   public abstract void getDetails();
   
   public abstract boolean isLiscensed();
}

class Bike extends Vehicle
{

	private String customer_name;
	private double price;
	private int liscence_no;
	
	Bike()
	{
		super();
		this.customer_name ="Rehman Khan";
		this.price =45674.43;
		this.liscence_no =456789;
	}
	
	Bike(int id,String cname,double pr,int lno)
	{
		super(id);
		this.customer_name=cname;
		this.price=pr;
		this.liscence_no=lno;
	}
	
	
	@Override
	public void getDetails() {
	 
		System.out.println("Custoemr Name : "+this.customer_name);
		System.out.println(" Is Vehicle is liscenceable  :"+this.isLiscensed());
		System.out.println("Liscence No : "+this.liscence_no);
		System.out.println(" Price  : "+this.price);
		
	}

	@Override
	public boolean isLiscensed() {
		
		if(this.liscence_no !=0)
		{
			System.out.println("Bike is Registered with Liscence no : "+this.liscence_no);
		return true;
		}
		else
		{
			System.out.println(" Not registered and liscensed");
			return false;
		}
	}
	
}


public class Example1 {

	public static void main(String[] args) {
	
		Bike b = new Bike();
		b.getDetails();
	}

}
