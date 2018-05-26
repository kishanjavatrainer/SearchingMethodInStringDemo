package com.infotech.client;

public class ClientTest2 {

	public static void main(String[] args) {
		String date = "05/26/2018";
		System.out.println("index " + date.indexOf('/'));
		String month = date.substring(0, date.indexOf('/'));
		System.out.println("month " + month);
	}
}
