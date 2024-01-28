// case1: Bassic type of Interface in java whicha have only variable and abstraact method

package InterfaceConcept;

interface MyInterface
{
	String name="Suraj";                        // varibale is treated like constant which is static,pulic and final
	
	abstract void getName();                     // these are abstract methods
	abstract void getAddress();
	
}

class Information implements MyInterface
{

	@Override
	public void getName() {           // concreate implemntation of abstract method defiend in parent class
		System.out.println(this.name);
		
	}

	@Override
	public void getAddress() {
	 System.out.println("You are from London");
		
	}
	
}
public class Main {

	public static void main(String[] args) {
		
		Information i = new Information();
		i.getName();
		i.getAddress();

	}

}
