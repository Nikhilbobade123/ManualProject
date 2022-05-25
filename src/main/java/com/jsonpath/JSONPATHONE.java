package com.jsonpath;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import io.restassured.path.json.JsonPath;

public class JSONPATHONE {
	public static void main(String[] args) throws FileNotFoundException {
	FileInputStream fis= new FileInputStream("C:/Users/hp/Downloads/Dashboard.json");
				
			
		JsonPath js= new JsonPath(fis);
		String value =js.getString("courses.api[0]");
		System.out.println(value);
	}

}
