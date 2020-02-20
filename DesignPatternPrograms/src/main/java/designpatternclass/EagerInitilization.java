package designpatternclass;
/**
 * Eager Initilization: Using singleton we perfrom eager initilization
 * @author Lokesh Naik
 * */

public class EagerInitilization 
{ 
  public static void main(String[] args)
  {
	  EagerPattern object=EagerPattern.getInstance();//calling instance method of Eagerpattern class
  }
}

class EagerPattern
{
  public static EagerPattern object=new EagerPattern();
  private EagerPattern()                                //private construtor is created
  {
	  System.out.println("Hey excel lokesh");
  }
  public static EagerPattern getInstance()            //returning the object
  {
	  return object;
  }
}
