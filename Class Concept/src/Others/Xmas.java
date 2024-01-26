package Others;

class Christmax implements Cloneable
{
	String name;
    String gifts;
    
    Christmax(String nm,String gts)
    {
    	this.name =nm;
    	this.gifts=gts;
    }
    
    public void sendGifts()
    {
    	System.out.println("Name of gift receiver "+this.name);
    	System.out.println("Gift to eb received :"+this.gifts);
    }
    
    protected Object clone() throws CloneNotSupportedException        //this is overridden method of object class
    
    {
    	return super.clone();
    	
    }
}
public class Xmas {

	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Christmax c =new Christmax("Sandeep","Piano");
		c.sendGifts();
		
		Christmax c1 = (Christmax)c.clone();
		c1.sendGifts();

	}

}
