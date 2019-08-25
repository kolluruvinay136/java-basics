/**
 * 
 */
package com.java.week1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * @author Vinay Raja Kolluru
 * Aug 14, 20199:44:03 PM
 */
public class RandomOperations implements Runnable{

	public static void main(String[] args) {
		RandomOperations A= new RandomOperations("A");
		RandomOperations B=new RandomOperations("B");
		A.start();
		B.start();
	}
	static int me() {
		return (true?null:0);
	}
	
	private Thread t;
	private String threadName;
	RandomOperations(String threadName){
		this.threadName=threadName; 
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
			System.out.println(threadName);
	}
	public void start() {
		if(t==null) {
			t=new Thread(this, threadName);
			t.start();
		}
	}
}
