//Approach 2: Calling Anonymous class
package Anonymousclass;

interface Employment
{
	public void Register();
}

     
public class Demoo {

	public static void main(String[] args) {
	    new Employment()
        {
	     public void Register()
	         {
	    	System.out.println("Job seekers please register befre apply");
	       }
        }.Register();
 
	}

}
