package com.bridgelabz.classes;

import com.bridgelabz.interfacepackage.Computer;
/**
 * @return Object
 * */

public class ComputerFactory                         
{
  public static Computer getInstance(String str) //Returns the desired object you want
  {
	  if(str.equals("PC"))
	  {
		  return new PC();
	  }
	  else if(str.equals("Laptop"))
	  {
		  return new Laptop();
	  }
	  else 
	  {
		  return new Server();
	  }
  }
}
