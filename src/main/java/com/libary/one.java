package com.libary;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;


public class one {
	public static void main(String[] args) {
		
		given()
		 .contentType(ContentType.JSON)

		.body("{\r\n"
				+ "\r\n"
				+ "\"name\":\"The Great Gatsby\",\r\n"
				+ "\"isbn\":\"nikh124\",\r\n"
				+ "\"aisle\":\"23222\",\r\n"
				+ "\"author\":\" F. Scott Fitzgerald\"\r\n"
				+ "}")
		.when()
		.post("http://216.10.245.166/Library/Addbook.php")
		.then()
		.log()
		.all();
		
	}

}
