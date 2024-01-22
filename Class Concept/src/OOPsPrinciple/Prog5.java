// Constructor Demo
// non parameterized 


package OOPsPrinciple;

class School
{
	private int scid;
	private String sc_name;
	private String city;
	
	
	School()                    // Default or Non-Parameterized Constructor
	{
		this.scid =23;
		this.sc_name ="BJS";
		this.city ="Allahabad";
	}
	
	School(int sid,String sname,String scty)
	{
		this.scid =sid;
		this.sc_name =sname;
		this.city =scty;
	}
	
	public void getScoolDetails()
	{
		System.out.println( "School Id : ="+this.scid);
		System.out.println("School Name :="+sc_name);
		System.out.println("City :="+this.city);
		System.out.println();
	}
}


public class Prog5 {

	public static void main(String[] args) {
		
		School sch = new School();
		sch.getScoolDetails();
		
		School sch1 = new School(54,"BGS","Prayagraj");
		sch1.getScoolDetails();

	}

}
