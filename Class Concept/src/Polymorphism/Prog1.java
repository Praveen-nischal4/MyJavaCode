// Parent clas refernce to child class can only access method overridden in child class 
// can't access any other method defined in child class
// Program written below demonstrate that :


package Polymorphism;

class Vehicle
{
	protected int vid;
	protected String category;
	protected String color;
	protected boolean isLiscenceable;
	
	
	Vehicle(int vd,String cat,String cl,boolean isL)
	{
		this.vid=vd;
		this.category=cat;
		this.color=cl;
		this.isLiscenceable=isL;
	}
	
	protected void vehicleDetail()
	{
		System.out.println("Vehicle DEtail :"+this.vid);
		System.out.println("Color : "+this.color);
	}
	
}


class Bike extends Vehicle
{
   	private double price;
	private double tank_Cap;
	private String customer_name;
	
	Bike(int vd, String cat, String cl, boolean isL,double pr,double tcp,String cname) {
		super(vd, cat, cl, isL);
		this.price =pr;
		this.tank_Cap=tcp;
		this.customer_name=cname;
		
	}
	
	@Override
	public  void vehicleDetail()
	{
		if(this.isLiscenceable)
		{
			System.out.println(" Vehicle is Liscenced under name :"+this.customer_name);
		}
		System.out.println("Vehicle DEtail : "+this.vid);
		System.out.println("Color : "+this.color);
		System.out.println("Fuel Tank Capacity : "+this.tank_Cap);
		System.out.println(" Vehcile Type : "+this.category);
		System.out.println(" VEhicle price : "+this.price);
	}
	
}
public class Prog1 {

	public static void main(String[] args) {
		
		Vehicle bike = new Bike(34,"Petrol","Red-Black",true,87560.32,45.78,"Mr. Shambhu");
		bike.vehicleDetail();
	}

}
