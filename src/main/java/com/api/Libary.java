package com.api;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;

public class Libary {
	public static void main(String[] args) {
		
	
	 given()
	 //   .header("Content-Type","application/json")
	 .contentType(ContentType.JSON)
	 .body("{\r\n"
	 		+ " \"name\":\"wings of Fair\",\r\n"
	 		+ "\"isbn\":\"Minopo09090909090NK\",\r\n"
	 		+ "\"aisle\":\"NN\",\r\n"
	 		+ "\"author\":\" \"\r\n"
	 		+ "   \r\n"
	 		+ "}")
	 .when()
	 .post("http://216.10.245.166/Library/Addbook.php")
	 .then()
	 .log()
	 .all();
}


}

	
	

	