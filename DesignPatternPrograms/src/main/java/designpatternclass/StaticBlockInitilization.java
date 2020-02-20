package designpatternclass;

class StaticPattern
{
	static StaticPattern object;
	private StaticPattern()
	{
		System.out.println("Hey Lokesh workhard:");
	}
	static
	{
		object=new StaticPattern();
	}
	public static StaticPattern getInstance()
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
