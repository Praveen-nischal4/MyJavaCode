// inheritence in interface

package InterfaceConcept;

 interface Person {
   public String getName();   
   public void getInfo();
}

interface Teacher extends Person
{	
	public String courseTaught();	
    public void getTeacherRating();
}

class MathsTeacher implements Teacher
{
	private String name;
	private String subTaught;
	private double techRate;
	private double exp;
	
	
	MathsTeacher(String nm,String st,double rating,double e)
	{
		this.name = nm;
		this.subTaught =st;
		this.techRate =rating;
		this.exp=e;
	}


	@Override
	public String getName() {
		return this.name;		
	}

	@Override
	public String courseTaught() {
	
		return this.subTaught;
	}

	@Override
	public void getTeacherRating() {
		System.out.println(this.techRate);
		
	}

	@Override
	public void getInfo() {		
		System.out.println("Name of Teacher : "+this.getName());
		System.out.println("Subject Taught : "+this.courseTaught());
		System.out.println(" Rating : "+this.techRate);
		System.out.println("Experience of Teaching : "+this.exp);		
	}	
}

public class Demoo {

	public static void main(String[] args) {
	 Teacher MTeacher = new MathsTeacher("Tripathi Sir","Mathematics",4.8,15.4);
	System.out.println(MTeacher.getName());
	
	System.out.println(MTeacher.courseTaught());
	
	MTeacher.getInfo();
	// MTeacher.getInfo();
	}

}
