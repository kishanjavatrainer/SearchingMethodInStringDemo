package com.infotech.client;

public class ClientTest4 {

	public static void main(String[] args) {
		String path = "home/index/test.html";
		String str = path.substring(path.indexOf('/') + 1,path.lastIndexOf('/'));
		System.out.println("str - " + str);
	}
}
