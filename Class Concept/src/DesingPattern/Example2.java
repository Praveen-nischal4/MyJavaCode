// Demo example of Early Initialization of Object
//Singleton Design Pattern Method2


package DesingPattern;

class MySingleton
{
	private static final MySingleton inst = new MySingleton();
	private String p_name;
	
	private MySingleton()
	{
		this.p_name ="Jhon Doe";
		//prevent initialization of object
	}
	
	public  static MySingleton getInstance()
	{
		return inst;
	}
	
	public void checkString()
	{
		String k = this.p_name;
		if(k.startsWith("J"))
		{
			System.out.println("true");
		}else
		{
			System.out.println("False");
		}
				
	}
}

public class Example2 {

	public static void main(String[] args) {
		
		MySingleton mys = MySingleton.getInstance();
		mys.checkString();

	}

}
