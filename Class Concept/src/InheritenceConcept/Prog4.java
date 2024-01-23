//Constructor chaining is a mechanism in Java where one constructor of a class can call
//another constructor of the same class or its parent class using this or super
// demo of this keyword i.e Constructor 
// this() constructor call can be used to invoke the current class constructor.

// this() : used to call or evoke parameterized constructor with default 
// below is example for the same.

package InheritenceConcept;

class NoteBook
{
	protected int nofpage;
	protected double price;
	protected String type;
	
	
	NoteBook()
	{
		this(200,35.50,"Ruler");
		
	}
	
	
	NoteBook(int pg,double pr,String typ)
	{
		this.nofpage=pg;
		this.price=pr;
		this.type=typ;
	}
	
	public void myNoteDEtails()
	{
		
		System.out.println(" No of Pages in Notebook :"+this.nofpage);
		System.out.println(" Price : "+this.price);
		System.out.println("Type : "+this.type);
		System.out.println();
	}
}


 class Classmate extends NoteBook
 {
	 private String brand;
	 
	 Classmate()
	 {
		 super();
		 this.brand ="Classmate";
	 }
 }
public class Prog4 {

	public static void main(String[] args) {
		
       Classmate cm = new Classmate();
       cm.myNoteDEtails();
	}

}
