package AbstractConcept;

abstract class Library {
    protected int bk_id;
    protected String bk_name;
    protected String auth_name;

    Library() {
        this.bk_id = 30;
        this.bk_name = "Basics of Java8";
        this.auth_name = "Nageshwar Rao";
    }
    
    Library(int bid,String bnm,String aname)
    {
    	this.bk_id=bid;
    	this.bk_name=bnm;
    	this.auth_name=aname;
    }

    abstract boolean isAvailable();

    public abstract void getBook();
}

class LibraryRecord extends Library {
	
	LibraryRecord()
	{
		super();
	}
	
	LibraryRecord(int bd,String bnme,String anm)
	{
		super(bd,bnme,anm);
	}
	
    @Override
    public boolean isAvailable() {
        return this.bk_id != 0;
    }

    @Override
    public void getBook() {
        boolean available = isAvailable();

        if (available == true) {
            System.out.println("Book is available with id: " + this.bk_id + ". You can issue this book.");
            System.out.println("Book Name: " + this.bk_name);
            System.out.println("Book ID: " + this.bk_id);
            System.out.println("Author Name: " + this.auth_name);
        } else {
            System.out.println("Book is Not Available");
        }
    }
}

public class LMS {
    public static void main(String[] args) {
      //  LibraryRecord lr = new LibraryRecord(50,"Bsic of ASP.Net","Aproxx");
    	
         LibraryRecord lr = new LibraryRecord();
    
          
        if (lr.isAvailable()) {
            lr.getBook();
        }else
        {
        	System.out.println("Not Available");
        }
    }
}
