// Object of class is initialize by either Constructor or by Getter Setter Method
// Constructor can be default or parameterized 
// you can say properties as getter setter method


package OOPsPrinciple;

class Manager
{
	private int mgid;
	private String mname;
	private String dept;
	
	
	public Manager(int mgid, String mname, String dept) {
		this.mgid = mgid;
		this.mname = mname;
		this.dept = dept;
	}


	public int getMgid() {
		return mgid;
	}


	public void setMgid(int mgid) {
		this.mgid = mgid;
	}


	public String getMname() {
		return mname;
	}


	public void setMname(String mname) {
		this.mname = mname;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	public void printMAgDetails()
	{
		System.out.println(this.mgid);
		System.out.println(this.mname);
		System.out.println(this.dept);
		System.out.println();
	}
	
}
public class Prog6 {

	public static void main(String[] args) {

    Manager mg = new Manager(54,"Sonu Sharma","Sales");
    mg.printMAgDetails();
 
    // update details 
    
    mg.setMname("Raju");
    mg.setMgid(23);
    mg.setDept("MArketing");
    
    mg.printMAgDetails();

	}

}
