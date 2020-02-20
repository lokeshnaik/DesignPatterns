package designpatternclass;

public class EagerInitilization 
{ 
  public static void main(String[] args)
  {
	  EagerPattern object=EagerPattern.getInstance();  
  }
}

class EagerPattern
{
  public static EagerPattern object=new EagerPattern();
  private EagerPattern()
  {
	  System.out.println("Hey excel lokesh");
  }
  public static EagerPattern getInstance()
  {
	  return object;
  }
}
