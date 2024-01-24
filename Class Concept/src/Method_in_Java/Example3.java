//statc method can only act on static variable not on isnatnce variable 
// but insatnce method can act on static variable also 
//below program can demonstrate

package Method_in_Java;


public class Example3 {

	int x=50;
	static int y=34;
	
	public static int myNumber(int z)     //myNumber is a static method
	{
		int res = y+z;
		return res;		
	}
	
	
	public static int mySquare(int d)
	{
		int result = d*d;
		return result;
	}
	
	public double Sum(double k)
	{
		double u =(double)x+k;
		return u;
	}
	
	public int myMultiply()
	{
		int f =x*y;
		return f;
	}
	public static void main(String[] args) {
		
	int s = Example3.myNumber(45);       // static methods can only taken on static variables 
	System.out.println(s);
	
	
	Example3 exp = new Example3();
	System.out.println(exp.Sum(49.256));  //this is instance method so act on instance variable
		
	System.out.println(exp.mySquare(45));   // instance method can call static method but not vice-versa
	
	System.out.println(exp.myMultiply());     // instance method can act on static method as well as static variable both.
	}

}
