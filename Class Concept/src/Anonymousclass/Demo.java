//Approach 1 : to call anyonymous class

package Anonymousclass;

public class Demo {

	public void display()
	{
		interface Cooler
		{
			 void exhaust();
		}
		
		new Cooler()
		{
			public void exhaust()
			{
				System.out.println("Hello i am exhaust");
			}
		}.exhaust();
	}
	public static void main(String[] args) {

   Demo d = new Demo();
   d.display();
		

	}

}
