package DesingPattern;

// Lazy initialization of object 
//Singleton Design  Pattern 
// Constructor is private in order to restrict main class object

 class Number
{
	private static Number n;                          //create a static instance of class_name  type
	int num;
	
	private Number()
	{
		this.num =5;
		//private constructor prevent object of this class outside
	}
	
	public static Number getInstance()
	{
		if(n ==null)
		{
			n = new Number();
		}
		
		return n;
	}
	
	public void printSquare()
	{
		int sq = num*num;
		System.out.println(" Square of a number is ="+sq);
	}
}


public class Example1 {

	public static void main(String[] args) {
		
		Number  no =Number.getInstance();
		no.printSquare();

	}

}
