package com.syntax.class14;

public class StringMethodsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 *  isEmpty() Method (boolean true or false)
		 *  isBlank();
		 */
		
		String name="n";
		System.out.println(name.isEmpty()); //false, any symbols(even space) in quotes --> false
		
		name="";
		System.out.println(name.isEmpty()); //true, empty quotes --> true
		
		name="   ";
		System.out.println(name.isBlank()); //true
		
		String str="   Nailya T ";
		System.out.println(str.trim()); // trim remove all spaces before and after sentences

		String longStr="This class is easy";
		System.out.println(longStr.startsWith("T")); //true
		System.out.println(longStr.startsWith("t")); //false
		System.out.println(longStr.startsWith("This")); //true
	}

}
