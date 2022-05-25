package com.libary;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;


public class Preeconduction {
	public static void main(String[] args) {
		given()
		 //   .queryParam("AuthorName", "qParm")
		// .contentType(ContentType.JSON)
		 .when()
		 .get("http://216.10.245.166/Library/GetBook.php")
		 .then()
		 .log()
		 .all();
		 
		 

		
	}

}
