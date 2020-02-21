package designpatternclass;
/**
 * Bill Pugh Singleton:Using instance we implementing the program
 * @author LOKESH NAIK
 * */

 class BillPughInitilization
{
	private  BillPughInitilization()             //private constructor is created
	{
		
	}
	public static  BillPughInitilization getInstance() // returning the object
	{
		return BillPughInner.INSTANCE;
	}
	private static class BillPughInner    //Creating inner class for creating instance
	{
		private static  BillPughInitilization INSTANCE=new BillPughInitilization();
	}
	public void display()
	{
		System.out.println("Just crack the coding Lokesh:");
	}
	
}


public class BillPughsingleton 
{
	public static void main(String[] args)
		{
			BillPughInitilization singleobject=BillPughInitilization.getInstance();
	       singleobject.display();
		}
	
}
