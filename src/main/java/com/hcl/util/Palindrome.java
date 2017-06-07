package com.hcl.util;

public class Palindrome {
	public static void main(String args[])
	{
		isPallindrome("vinod");
		
	}
	public static void isPallindrome(String s)
    { 
		if(s.length() == 0 || s.length() == 1)
			System.out.println(s + " is a pallindrome");
		else 
        if(s.charAt(0) == s.charAt(s.length()-1))
        isPallindrome(s.substring(1, s.length()-1));
		System.out.println(s + "is a not a pallindrome");
    }

}
