package com.vinay.primitives;

/* w.a.p for the below requirements create two methods
1.static method with int argument and string argument, concat the argument and print, call the method from main method..

*/


class Concatination 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		concatAndPrint(55, "herooo");                // calling the method from main method.
		System.out.println("main ends");
	}
	public static void concatAndPrint(int i, String j) // static method with int and string arguments
	{
		System.out.println(i+""+j);   //concat and printing
		
	}
}
