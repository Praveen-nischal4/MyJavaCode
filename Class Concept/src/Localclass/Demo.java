package Localclass;

import java.util.Scanner;

public class Demo {
 
	String deptname;
	
	public void getData()
	  {
	       Scanner sn = new Scanner(System.in);
	       System.out.println("Enter dept name");
	        deptname =sn.next();
	
	     if(deptname.equals("Accounts"))
	      {
		     class Account
		     {
		    	 void input()
		    	 {
		    		 System.out.println("This is account class");
		    	 }
		     }
		     Account a = new Account();
		     a.input();
	       }else
	       {
	    	   class Manager
	    	   {
	    		   void input()
	    		   {
	    			   System.out.println("This is manager class");
	    		   }
	    	   }
	    	   Manager m = new Manager();
	    	   m.input();
	       }
	
	}
	
	
	public static void main(String[] args) {
	Demo d = new Demo();
	d.getData();
	}

}
