package Anonymousclass;

class Flower
{
	public void rose()
	{
		System.out.println("HEllo i am rose flower  red in color");
	}
}

public class Example {

	public static void main(String[] args) {
		 new Flower()
		 {
			 public void rose()
			 {
				 System.out.println("This is king of flower");
			 }
		 }.rose();

	}

}
