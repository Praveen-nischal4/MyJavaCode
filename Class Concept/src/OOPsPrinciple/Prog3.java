// array of a object method2


package OOPsPrinciple;

import java.util.Scanner;

class Animal
{
	private int anid;
	private String name;
	private String type;
	
	
	Animal()
	{
	  this.anid = 2;
	  this.name ="Tiger";
	  this.type = "Wild Animal";  
	}
	
	Animal(int ad,String nm,String tp)
	{
		this.anid =ad;
		this.name =nm;
		this.type =tp;
	}
	
	public void getDetail()
	{
		System.out.println(this.anid);
		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println();
	}
}
public class Prog3 {

	public static void main(String[] args) {

		Animal ap[] = new Animal[2];
                                             //method2 of adding object array
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Enter animal details: ID, name, type");
		int ad = sn.nextInt();
		String n =sn.next();
		String t = sn.next();
		
		ap[0]=new Animal(ad,n,t);
		ap[0].getDetail();
		
		System.out.println("Enter animal details: ID, name, type");
		int ad1 = sn.nextInt();
		String n1 =sn.next();
		String t1 = sn.next();
		
		ap[1]=new Animal(ad1,n1,t1);
		ap[1].getDetail();
		
		

	}

}
