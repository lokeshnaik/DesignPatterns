package com.bridgelabz.prototype;

import java.util.List;
import java.util.ArrayList;

public class Employees implements Cloneable{

	private List<String> employeeList;
	
	public Employees(){
		employeeList = new ArrayList<String>();
	}
	
	public Employees(List<String> list){
		this.employeeList=list;
	}
	public void loadData()                 //read all employees from database and put into the list
	{
		
		System.out.println("Enter how many members you want to load form the data base:");
		 int number=UtilityScanner.integerInput();  //Taking integer input from the Utilityscanner class
		 System.out.println("Enter the employees names:");
		 int i;
		 for(i=0;i<number;i++)
		 {
			 String str=UtilityScanner.stringInput();  //Taking string input from the Utilityscanner class
			 employeeList.add(str);
		 }
	}
	
	public List<String> getEmpList() {
		return employeeList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
			List<String> temp = new ArrayList<String>();
			for(String s : this.getEmpList()){
				temp.add(s);
			}
			return new Employees(temp);
	}
	
}
