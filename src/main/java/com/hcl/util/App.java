package com.hcl.util;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(reverseString("vinod kumar bobbili",""));
    }
    
    public static String reverseString(String str,String reverseString){
    	
    	if(str.length() == 1){
    	return str;
    	} else {
    		reverseString += str.charAt(str.length()-1)+reverseString(str.substring(0,str.length()-1),reverseString);
    		return reverseString;
    	}
    	}

}
