// wap to interchange value 
// in java everything pass in method as parameter is 'call by value'.
// Below Program will demonstrate


package Method_in_Java;

public class Example6 {
  
	int x,y;
	
	Example6(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public void swap(Example6 obj)
	{
		int temp;
		temp=obj.x;
		obj.x=obj.y;
		obj.y=temp;
	}
	
	public static void main(String[] args) {
		
		Example6 obj = new Example6(5,9);
		
		System.out.println("Before using swap method value of :");
		System.out.println(obj.x+"\t"+obj.y);
		
		obj.swap(obj);
		
		System.out.println("Before using swap method value of :");
		System.out.println(obj.x+"\t"+obj.y);
		
		
	}

}
