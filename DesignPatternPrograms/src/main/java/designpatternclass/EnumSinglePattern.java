package designpatternclass;

enum EnumSingleton
{
	INSTANCE;
	int i;
	public void show()
	{
		System.out.println(i);
	}
}

public class EnumSinglePattern
{
	public static void main(String [] args)
	{
		EnumSingleton object=EnumSingleton.INSTANCE;
		object.i=5;
		object.show();
		EnumSingleton object1=EnumSingleton.INSTANCE;
		object1.i=7;
		object1.show();
	}
}