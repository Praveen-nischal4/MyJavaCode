// Array of object method 3 which is used later :

package OOPsPrinciple;

import java.util.Scanner;

class Toys
{
	private int tid;
	private String name;
	
	Toys()
	{
		this.tid =4;
		this.name="Teddy";
	}
	
	Toys(int td,String nm)
	{
		this.tid =td;
		this.name =nm;
	}
	
	
	public void getDisplay()
	{
		System.out.println("Toy Id :"+this.tid);
		System.out.println("Toy Name :"+this.name);
		System.out.println();
	}
}
public class Prog4 {

	public static void main(String[] args) {
    
		Toys t = new Toys();              //normal object of Toy class
		t.getDisplay();
		
		Toys ty[] = new Toys[3];               //array of object of Toy class
	 	
		Scanner sn = new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
		   System.out.println("Enter toy id :");
		   int tid = sn.nextInt();
		   
		   System.out.println("Enter name of Toy :");
			String nm1 =sn.next();
			
			ty[i] = new Toys(tid,nm1);
		}
		
		for(int i=0;i<3;i++)
		{
			ty[i].getDisplay();
		}

	}

}
