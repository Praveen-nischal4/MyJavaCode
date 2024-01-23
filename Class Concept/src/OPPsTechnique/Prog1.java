// Method Overloading :-  Method is said to be overloaded if it has multiple definition each differ
// by no of arguments,types of argument but name of method is same.
//Example below show method overloading

package OPPsTechnique;

class Addition
{
	public void addition()
	{
	     int n=5;
	     int m=10;
	     int result = m+n;
	     System.out.println("Addition ="+result);
	}
	
	public int addition(int x,int y)
	{
		return x+y;
	}
	
	public String addition(String a,String b)
	{
		return a+b;
	}
}
public class Prog1 {

	public static void main(String[] args) {
		Addition a = new Addition();
		a.addition();
       System.out.println("Addition 2nd method : "+a.addition(34,56));
       System.out.println("Addition of String :"+a.addition("Raju", "Kesherwani"));
	}

}
