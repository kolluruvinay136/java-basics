package com.vinay.primitives;


/* w.a.p for below requirements
1. static method with two integer arguments, perform addition and print.
2. create non-static method with two double arguments and perform aubstraction and print.
call both the methods from main method..

*/



class ArithematicOperations 
{
	public static void main(String[] args) 
	{
		System.out.println("mains starts...");
		add(10,10);							//  calling the static method from main method.
		ArithematicOperations obj= new ArithematicOperations();
		obj.sub(5.5,2.2);						//  calling the non-static method from main method.
		System.out.println("main ends...");
	}
	public static void add(int i, int j)     // static method
	{
		System.out.println(i+j);			// addition operation and printing
	}
	public void sub(double k, double l)      // non-static method
	{
		System.out.println(k-l);			// substraction operation and printing
	}
}
