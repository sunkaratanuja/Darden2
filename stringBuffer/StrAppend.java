package com.stringBuffer;

public class StrAppend {

	public static void main(String[] args) {
		//declaring strings
		String s1="StringBuffer";
		String s2="is a peer class of String";
		String s3="that provides much of";
		String s4="the functionality of strings.";
		//appending strings
		String Buffer=String.format("%s %s %s %s",s1,s2,s3,s4);
		System.out.println(Buffer.toString());
		
        
	}

}
