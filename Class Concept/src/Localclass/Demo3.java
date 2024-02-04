// Local class is class that is defined within a block of code.
// class is declared inside method body and members are declared inside class
// its only accessible in method which is defined 
// These local classes are defiend inside method body, constructor and static initializer block


package Localclass;

public class Demo3 
 {
   private int y=300;
   public void print()
   {
	   int z=100;
	   
	   class Test                     //local class
	   {
		   int x=400;
		   public void display()
		   {
			   System.out.print("sum =");
			   System.out.print(y+z+x);
		   }
	   }
	   
	   Test t = new Test();
	   t.display();
   }
     	
	public static void main(String[] args) {
		
		Demo3 d = new Demo3();
		d.print();
	}

}
