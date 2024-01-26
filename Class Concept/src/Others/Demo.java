// use of 'Object' class methods()
package Others;

class MyClass
{
	int x;
	
	MyClass(int x)
	{
		this.x=x;
	}
}

class knowName
{
	public static void printName(Object obj)
	{
		Class c = obj.getClass();
		String name = c.getName();
		System.out.println("The class name :"+name);
	}
}
public class Demo {

	public static void main(String[] args) {

		MyClass obj = new MyClass(30);
        knowName.printName(obj); 
	} 

}
