package com.devopsdemo.helper;

import java.util.Enumeration;
import java.util.ResourceBundle;

public class GenericResourceBundlev2 {
	public static String getProperties(String source){
		ResourceBundle rb = ResourceBundle.getBundle("ResourceBundle");
		Enumeration <String> keys = rb.getKeys();
		String value="";
		System.out.println("Git push and trigger the build again...");
		while (keys.hasMoreElements()) {
			
			String key =  keys.nextElement();
			
			if(key.equalsIgnoreCase(source)){
				value = rb.getString(key);
			}
		}
		return value;
	}
	
}

