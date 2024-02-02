package NestedClasses;

public class Teacher {
	
	private int t_id;
	private String t_name;	
	private int size;
	private Subject[] sub;

	Teacher(int id,String tname,int size)
	{
		this.t_id=id;
		this.t_name=tname;
		this.size=size;
		this.sub=new Subject[size];
	}
	
	
	public class Subject 
	{
		private int sub_id;
		private String sub_name;
		
		
		Subject(int sid,String sname)
		{
			this.sub_id =sid;
			this.sub_name=sname;
		}
		
		
		public String getSubjectName()
		{
			return sub_name;
		}
		
		public int getSubjectId()
		{
			return sub_id;
		}
		
		//method to display all alloted subject to teacher
		
		public void displaySubjectInfo()
		{
			System.out.println(" Subject Id : "+sub_id);
			System.out.println("Subject Name : "+sub_name);
			System.out.println("Teacher ID : "+t_id);
			System.out.println("Alloted Teacher Name : "+t_name);			
		}
		
	}
	
	//method to add subject to teacher class
	
	public void addSubject(int sub_id,String sub_name)
	{
		for(int i=0;i<size;i++)
		{
			if(sub[i]==null)
			{
				sub[i] = new Subject(sub_id,sub_name);
				System.out.println("Record inserted");
				return;
			}
		}
		System.out.println("Teacher got Max subject Cannot Assigned  more Subjects.");
	}
	
	
	//method to display all subject assigned to teacher
	
	public void displaySubject()
	{
		for(Subject subject :sub)
		{
			if(subject!=null)
			{
				subject.displaySubjectInfo();
				System.out.println("<--------->");
			}
		}
	}
	
	public static void main(String[] args) {
		
	Teacher t = new Teacher(100,"Tripathi Sir",5);
	
	t.addSubject(1, "Physics");
	t.addSubject(2, "Maths");
	t.addSubject(3, "Digital Physics");
	t.displaySubject();

	}

}
