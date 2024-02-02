//if you want to access non-static variable in static method then you have to create object 
//Static class can access only static variables and methods of outside class.
//static class can access non static variable and method of outside class only whn we have object of outer class

//Program below will demonstrate it.


package Innerclass_Concpet;

public class Vehicle {

	private static int vid;
	private String color;
	private String type;
	private String name;
	

	public static void getVehicleDetail()                         //static method of Vechile class
	{
		Vehicle v = new Vehicle();	
		v.type="Petrol";
		System.out.println(" Vehicle Id : "+vid);
		System.out.println("Type of Vehicle : "+v.type);     // 'non-static' member of Vehicle class
	}
	
	
	public static class MotorBike                              //static nested class
	{
		private static String noplate="UP 70 A4567";
		
		public static void getnoPlate()
		{
	    	Vehicle v = new Vehicle();
	    	v.color="Blue";
	    	v.vid=7;
			getVehicleDetail();	
		
			
			System.out.println(MotorBike.noplate);
			v.genMessage();           // since genMessage is non-static method of outer class
			
		}
		
		
	}
	
	public void genMessage()
	{
		System.out.println("Thanks for choosing this "+this.name+ "motor Bike");
	}
	
	
	public static void main(String[] args) {
		
		Vehicle v = new Vehicle();
		Vehicle.MotorBike m = new Vehicle.MotorBike();
		MotorBike.getnoPlate();

	}

}
