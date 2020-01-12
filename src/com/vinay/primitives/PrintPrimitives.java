package com.vinay.primitives;

/* w.a.p for the below requirements create two methods 
1. static method with three arguments, print all the arguments, call the method from main method..

*/


class PrintPrimitives 
{
	public static void main(String[] args)   // method 1
	{
		System.out.println("main starts");
		printPrimitives(5, 8.9, 'A');	                 // calling the method from main method.
		System.out.println("main ends");
	}
	public static void printPrimitives(int i, double j, char k)  // method 2
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
}
