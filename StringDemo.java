package com.syntax.class14;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Hello67";
		
		String str2=new String ("Hello");
		System.out.println(str2.length()); //5 symbols
		System.out.println(str.length()); // 7 symbols(every symbols counted, even space
		
		
		System.out.println("------------------");
		
		String name="NAILYA";
		System.out.println(name.toLowerCase()); //nailya
		
		String name2="daulet";
		System.out.println(name2.toUpperCase()); //DAULET
		

		System.out.println("------------------");
		
		String firstName="Ilyas";
		String lastName="Talgat";
		System.out.println(firstName.concat(" ").concat(lastName)); //another way to add (+)--> concat(). means "+" 
		
		
		
		
		}

}
