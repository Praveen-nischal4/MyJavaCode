// Inheritance with constructor (i.e default) in parent class
// It's upto you either you use 'super' keyword or complier will call super() self 
// since members of parent class must be initialize before child class

package InheritenceConcept;

class Mobile
{
	protected String model_no;
	protected String brand;
	protected String memory;
	protected int Android_version;
	
	
	Mobile()
	{
		this.model_no ="Vivo1933";
		this.brand ="Vivo";
		this.memory ="128GB";
		this.Android_version =10;
	}
	
	protected  void Display()
	{
		System.out.println(" Model No : "+this.model_no);
		System.out.println("Brand : "+this.brand);
		System.out.println("Internal Memory : "+this.memory);
		System.out.println(" Android Version : "+this.Android_version);
		System.out.println();
	}
}

class Oppo extends Mobile
{
   private double price;
   private String color;
   private int megapixel;
   
   Oppo()
   {
	   super();                 // super() is used to call the default constructor of parent class
	   this.price =35984.254;
	   this.color ="Golden rose";
	   this.megapixel =60;
   }
   
   public void printMobiDetails()
   {
	   super.Display();               // super also used to call method() of parent class
	   System.out.println("Price : "+this.price);
	   System.out.println("Color : "+this.color);
	   System.out.println("Camera Quality : "+this.megapixel);
   }
}

public class Prog2 {

	public static void main(String[] args) {
      
		Oppo o = new Oppo();
		o.printMobiDetails();

	}

}

