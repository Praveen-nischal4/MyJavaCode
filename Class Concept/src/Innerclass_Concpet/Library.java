package Innerclass_Concpet;

import java.time.LocalDate;

public class Library {

	private String name;
	private String location;
	private int noOfBooks;
	private boolean isCardIssued;
	
	
	Library(String nm,String lt,int nb,boolean isCS)
	{
		this.name =nm;
		this.location=lt;
		this.noOfBooks=nb;
		this.isCardIssued=isCS;
	}
	
	public boolean isCardIssued()
	{
		return this.isCardIssued;
		
	}
	
	  public class LibraryRecord
	  {
	        private String authorname;
	        private LocalDate returnDate;
	        private LocalDate issueDate;
	        private double fine;
	        
	        LibraryRecord(String atn,LocalDate rd,LocalDate id,double fn)
	        {
	        	this.authorname=atn;
	        	this.returnDate=rd;
	        	this.issueDate=id;
	        	this.fine=fn;
	        }
	        
	        public LocalDate getReturnDate()
	        {
	        	return this.returnDate;
	        }
	        
	        public LocalDate getIssueDate()
	        {
	        	return this.issueDate;
	        }
	      
	        public void issueBook()
	        {
	        	  Library L =new Library("BJS","PRayagraj",4,true);
	        	  if(L.isCardIssued())
	        	   {
	        	    	System.out.println("Library Name : "+L.name); 
	        	    	System.out.println("Library Location : "+L.location);
	        	    	System.out.println("No of books : "+L.noOfBooks);
	        	    	System.out.println("Author Name : "+this.authorname);
	        	    	
	        	    	if(checkDate()>0)
	        	    	{
	        	    		this.fine+=10;
	        	    		System.out.println("Fine ="+this.fine);
	        	    		
	        	    	}else
	        	    	{
	        	    		this.fine=0;
	        	    		System.out.println("Fine ="+fine);
	        	    	}
	        	        	L.generalMessage();    	 
	        	   }else
	        	   {
	        		  System.out.println("Get issued your Library card First");
	        		  System.out.println("Sorry !!!!! You can't issue book");
	        	   }
	        }
	        private int checkDate() {
	        	
	    		return this.returnDate.compareTo(this.issueDate);
	    		
	    	}
		    
	 }
	  
	  public void generalMessage()
	  {
		  System.out.println("Thanks for issuing Book with "+this.name);
	  }
	  
	
	
	public static void main(String[] args) {
		
		Library L=new Library("Public Library","Lucknow",3,true);
		Library.LibraryRecord lr = L.new LibraryRecord("Nageshwar Rao",LocalDate.parse("2024-01-06"), LocalDate.parse("2023-12-31"), 5.20);
		lr.issueBook();
		

	}

}
