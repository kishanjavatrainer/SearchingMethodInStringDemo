package com.infotech.client;

public class ClientTest5 {

	public static void main(String[] args) {
		String str1 = "Contains example";
		String str2 = "example";
		String st3 = "Example";
		System.out.println("str1 contains str2: " + str1.contains(str2));
		 System.out.println("str1 contains str2: " + str1.contains(st3));
		 
		 System.out.println("str1 contains str2: " + str1.toLowerCase().contains(
				 st3.toLowerCase()));
	}
}
