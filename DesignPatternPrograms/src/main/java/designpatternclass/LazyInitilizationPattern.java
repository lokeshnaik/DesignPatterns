package designpatternclass;
/**
 * Lazy Initilization: Using singleton we perfrom eager initilization
 * @author Lokesh Naik
 * */

class LazyInitilization
{
	static LazyInitilization object;
	private LazyInitilization()                       //private construtor is created
	{
		System.out.println("Hey Lokesh just prove what you are:");
	}
	public static LazyInitilization getInstance()    //returning the object
	{
		if(object==null)
		{
			object=new LazyInitilization();
		}
		return object;
	}
}

public class LazyInitilizationPattern {

	public static void main(String[] args) 
	{
		LazyInitilization object=LazyInitilization.getInstance();//calling instance method of LazyInitilization class
	}

}
