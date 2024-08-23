package ch15.sec04.exam04;

import java.util.*;

public class PropertiesExample{

	public static void main(String[] args)  throws Exception{
		Properties prop = new Properties();
		prop.load(PropertiesExample.class.getResourceAsStream("database.properties"));
		
		//
		String driver = prop.getProperty("driver");
		System.out.println("driver:"+ driver);

	}

}
