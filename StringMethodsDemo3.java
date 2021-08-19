package com.syntax.class14;

public class StringMethodsDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String longStr="This class is easy";
		System.out.println(longStr.endsWith("y")); //true
		System.out.println(longStr.endsWith("easy"));//true
		System.out.println(longStr.endsWith("This class is easy"));//true
		
		
		System.out.println(longStr.contains("class")); //true
		System.out.println(longStr.contains("hello")); //false
		System.out.println(longStr.contains("class  ")); //false -->there are 2 spaces, doesn't match with given sentence
		
		longStr="blabla";
		System.out.println(longStr.equals("blabla")); //true
		System.out.println(longStr.equalsIgnoreCase("BLABLA")); //true, ignoreCase ignore any letters in word
		
		System.out.println(longStr.charAt(0)); // b --> prints one letter (number of letter)
		System.out.println(longStr.charAt(1)); // l
		System.out.println(longStr.charAt(2)); // a
		
		System.out.println(longStr.indexOf("b")); // 0 index of letter in the word
		System.out.println(longStr.indexOf("l")); // 1
		System.out.println(longStr.indexOf("a")); // 2
		System.out.println(longStr.indexOf("z")); // -1 --> means there is no this letter
		System.out.println(longStr.indexOf("b", longStr.indexOf("b")+1)); // 3 (second b in the letter)
		
		
		System.out.println(longStr.substring(5)); // a 
		System.out.println(longStr.substring(3)); // bla
		System.out.println(longStr.substring(2, 4)); // ab 
		
		
	}

}
