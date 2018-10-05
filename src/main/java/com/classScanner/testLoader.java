package com.classScanner;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

public class testLoader {

	public static void main(String[] args) throws Exception {
		ClassLoader  cl = Thread.currentThread().getContextClassLoader();
		//Enumeration<URL> url=cl.getResources("org/springframework");
		Enumeration<URL> url=cl.getResources("com/classScanner");
		
		while(url.hasMoreElements())
		{  
			
			URL u1=url.nextElement();
			System.out.println(u1);
			System.out.println(u1.getProtocol());
			System.out.println(u1.getFile());
		}
		
	} 

}
