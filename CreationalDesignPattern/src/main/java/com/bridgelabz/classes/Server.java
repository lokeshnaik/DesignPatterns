package com.bridgelabz.classes;

import com.bridgelabz.interfacepackage.Computer;

public class Server implements Computer
{
	@Override
  public void show()
  {
	  System.out.println("Am in Server class");
  }
}
