package com.bridgelabz.prototype;

import java.util.List;

/**
 * Prototype Pattern:Implementing prototype pattern using  deep clone method 
 * and by implementing cloneable interface
 * @author Lokesh Naik
 * */

public class PrototypeDesignPattern 
{
 public static void main(String[]args) throws CloneNotSupportedException
 {
	 
	 Employees emps = new Employees();
		emps.loadData();
		Employees employeesNew = (Employees) emps.clone();
		Employees employeesNew1 = (Employees) emps.clone();
		System.out.println("Enter the employee you want to add:");
		String str=UtilityScanner.stringInput();                 //Taking string input from the Utilityscanner class
		List<String> list = employeesNew.getEmpList();
		list.add(str);
		System.out.println("Enter the employee you want to remove:");
		String string=UtilityScanner.stringInput();            //Taking string input from the Utilityscanner class
		List<String> list1 = employeesNew1.getEmpList();
		list1.remove(string);
		
		System.out.println("employees List: "+emps.getEmpList());
		System.out.println("New list of employees of employeesNew "+list);
		System.out.println("New list of employees of employeesNew1: "+list1);
 }
}
