package designpatternclass;

class LazyInitilization
{
	static LazyInitilization object;
	private LazyInitilization()
	{
		System.out.println("Hey Lokesh just prove what you are:");
	}
	public static LazyInitilization getInstance()
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
		LazyInitilization object=LazyInitilization.getInstance();
	}

}
