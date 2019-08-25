/**
 * 
 */
package com.java.week1;

/**
 * @author Vinay Raja Kolluru
 * Aug 14, 20194:43:37 PM
 */
public class WizardString {

	public static void main(String[] args) {
		String wizard ="Pravallika Kummari";
		System.out.println(wizard.substring(0, wizard.indexOf(" ")));
		System.out.println(wizard.substring(wizard.indexOf(" ")+1));
		System.out.println(wizard.substring(wizard.indexOf(" ")+1)+  ", "+   wizard.substring(0, wizard.indexOf(" ")));
		System.out.println(wizard.charAt(0)+ "."+ wizard.charAt(wizard.indexOf(" ")+1)+ ".");
	}
}
