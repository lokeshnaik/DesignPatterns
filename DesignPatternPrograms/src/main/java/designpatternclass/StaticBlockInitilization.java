package designpatternclass;

/**
 * Static Pattern Initilization: Using singleton we perfrom static initilization
 * @author Lokesh Naik
 * */

class StaticPattern
{
	static StaticPattern object;
	private StaticPattern()                             //private construtor is created

	{
		System.out.println("Hey Lokesh workhard:");
	}
	static
	{
		object=new StaticPattern();
	}
	public static StaticPattern getInstance()           //returning the object
	{
		return object;
	}
}

public class StaticBlockInitilization
{

	public static void main(String[] args) 
	{
		StaticPattern object=StaticPattern.getInstance(); 
	}

}
