package com.bridgelabz.classes;

import com.bridgelabz.interfacepackage.Computer;

public class ComputerFactory
{
  public static Computer getInstance(String str)
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
