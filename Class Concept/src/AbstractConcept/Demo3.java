// Since we can access all features of sub class using object of sub class but we prefer to create 
// reference of super class and access (functionality) or methods of sub class just to bring decipline 
// that programmer can't add other features which are not declared in super class
// reference will not access other method written in sub classes which are not in super class

package AbstractConcept;

abstract class Shapes
{
	protected int side;
	
	Shapes()
	{
		this.side =5;
	}
	
	abstract double calculateArea();
	abstract double calculatePerimeter();
}

class Square extends Shapes
{

	Square()
	{
		super();
	}
	
	@Override
	double calculateArea() {
		
		return this.side*this.side;
	}

	@Override
	double calculatePerimeter() {
		
		return 4*this.side;
	}
	
	public void mySelf()
	{
		System.out.println("I am square");
	}
}

public class Demo3 {

	public static void main(String[] args) {
		
		Square sq = new Square();
       System.out.println("Area of Square :"+sq.calculateArea());
       System.out.println("Perimeter of Square : "+sq.calculatePerimeter());
       sq.mySelf();          // method of chidl class only
       
       System.out.println(" Using abstract class refernece difference :");
       Shapes s = new Square();
       System.out.println("Area of Square :"+s.calculateArea());
       System.out.println("Perimeter of Square : "+s.calculatePerimeter());
      // s.mySelf();  // since this  method is not in parent class so 
	}

}
