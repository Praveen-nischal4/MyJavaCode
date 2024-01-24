// wap to interchange value in employee object
//pasing a Employee class object
// Below program can demonstrate 


package Method_in_Java;

public class Example5 {
	
	 int id;
	 
	 Example5(int id)
	 {
		 this.id=id;
	 }
	 
	 public void Swap(Example5 ex1,Example5 ex2)
	 {
		 Example5 temp;
		 temp =ex1;
		 ex1=ex2;
		 ex2 =temp;
	 }

	public static void main(String[] args) {
		
	Example5 ex1 =new Example5(4);
	Example5 ex2 = new Example5(7);
	
	System.out.println("Before value ");
	System.out.println(ex1.id +"\t"+ex2.id);
	
	System.out.println("After using swap method");
	System.out.println(ex1.id+"\t"+ex2.id);

	// whatever we are pasing in parameter either data type,value or object it m eans a copy of object is 
	//sent to the method and whatever procesing is one is on the copy so no chnage effect after
	//coming out of method 
	}

}
