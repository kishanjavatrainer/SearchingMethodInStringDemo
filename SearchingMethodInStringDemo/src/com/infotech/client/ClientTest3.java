package com.infotech.client;

public class ClientTest3 {

	public static void main(String[] args) {
		String date = "05/26/2018";
		System.out.println("index " + date.lastIndexOf('/'));
		String year = date.substring(date.lastIndexOf('/') + 1);
		System.out.println("year " + year);
	}
}
