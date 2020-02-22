package com.bridgelabz.classes;

import com.bridgelabz.interfacepackage.Computer;

public class MainClass {

	public static void main(String[] args)
	{
		ComputerFactory object=new ComputerFactory();
		Computer object1=object.getInstance("Laptop");
		object1.show();

	}

}
