package com.stringBuffer;

public class StrInsert {

	public static void main(String[] args) {
		//declaring string
		StringBuffer add=new StringBuffer("It is used to at the specified index position");
		//insert method
		add.insert(13," insert text ");
		System.out.println(add);

	}

}
