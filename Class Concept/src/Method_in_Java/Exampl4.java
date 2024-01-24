// instance variable has seprate copy for each object whereasclass vvariable has one single copy 
//which shared by each object so change effect and in instance variable case it does'nt 
//Program below will demonstrate 


package Method_in_Java;

public class Exampl4 {

	int x=4;
	static int y=5;
	
	
	public static void main(String[] args) {
		
	 Exampl4 ex = new Exampl4();
	 System.out.println(++ex.x);
	 
	 Exampl4 ex1 = new Exampl4();
	 System.out.println((ex1.x));
	 
	 System.out.println("Now with static or class variable you can see effect");
	 
	 System.out.println(++Exampl4.y);
     System.out.println(Exampl4.y);
	}

}
