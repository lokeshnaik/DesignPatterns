package designpatternclass;
/**
 *Reflection Pattern:Voilating the principles of Singleton pattern using reflection pattern.
 *@author Lokesh Naik 
 **/

import java.lang.reflect.Constructor;

class Singleton
{
	public static Singleton instance=new Singleton();
	private Singleton()
	{
		
	}
}

public class RefelectionPattern {

	public static void main(String[] args) 
	{
		Singleton instance1=Singleton.instance;
		Singleton instance2=null;
		try
		{
		 Constructor []constructors=Singleton.class.getDeclaredConstructors();	
		 for(Constructor constructor:constructors)
		 {
			 constructor.setAccessible(true);                //Enabling the access to the constructor
			 instance2=(Singleton)constructor.newInstance();    
			 break;
		 }
		}
        catch(Exception e)
		{
        	e.printStackTrace();
		}
		System.out.println("Instance1.hashCode:-" +instance1.hashCode()); //printing the hashcode of the object
		
		System.out.println("Instance1.hashCode:- " +instance2.hashCode());//printing the hashcode of the object
	}
	
}
