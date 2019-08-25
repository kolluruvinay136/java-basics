/**
 * 
 */
package com.java.week1;

/**
 * @author Vinay Raja Kolluru
 * Aug 14, 20197:23:01 PM
 */
public class ObjectLab {

	public static void main(String[] args) {
		String object = "bearbearbearcabearcatbebebear";
		System.out.println(object.indexOf("bearcat"));
		System.out.println(object.substring(object.indexOf("bearcat"), object.indexOf("bearcat")+"bearcat".length()));
		System.out.println("Northwest".concat(object.substring(object.indexOf("bearcat"), object.indexOf("bearcat")+"bearcat".length())));
	
	
	}
}
