package com.bridgelabz.prototype;

import java.util.Scanner;

public class UtilityScanner
{

	private static final Scanner sc=new Scanner(System.in);
	public static int integerInput()
	{
		return sc.nextInt();	
	}
	public static String stringInput()
	{
		return sc.next();	
	}
	public static float floatInput()
	{
		return sc.nextFloat();	
	}
	public static double doubleInput()
	{
		return sc.nextDouble();	
	}
	

}
