package Anonymousclass;

interface OSystem
{
	abstract void defOS();
}

public class OperatingSystem {

  OSystem o = new OSystem()
    {
    	public void defOS()
    	{
    		System.out.println("Language used to write OS");
    		System.out.println("New Features in this OS");
    	}
    };
  
	public static void main(String[] args) {

      OperatingSystem oss = new OperatingSystem();
       
      oss.o.defOS();

	}

}
