// Inheritance : Properties of Parent class i.e Super class is shared to Child class i.e Derived Class
// Program demonstrate inheritance below :

package InheritenceConcept;

class Automobiles
{
	protected int id;
	protected String chno;
	protected String type;
	
	
	Automobiles()
	{
		this.id =43;
		this.chno ="A43FD";
		this.type = "Two wheeler";
	}
	
	public void getDetail()
	{
		System.out.println(" Vehcile Id :"+this.id);
		System.out.println("Chechis No :"+this.chno);
		System.out.println("Type of Vehicle "+this.type);
	}
}

class MotorBike extends Automobiles
{
	private String fuelType;
	private double price;
	
	
	
	public String getFuelType() {
		return fuelType;
	}



	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public void printDetails()
	{
		getDetail();
		System.out.println(" type of Fuel ="+this.fuelType);
		System.out.println("price ="+this.price);
	}
}


public class Prog1 {

	public static void main(String[] args) {
		
		MotorBike mb = new MotorBike();
		mb.setFuelType("Disel");
		mb.setPrice(45999.254);
		
		mb.printDetails();

	}

}
