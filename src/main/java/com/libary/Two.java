package com.libary;
import static io.restassured.RestAssured.given;


public class Two {
	public static void main(String[] args) {
		given().
		get("http://216.10.245.166/Library/GetBook.php?ID=nikh12423222")
		.then()
		.log()
		.all();
		
	
	}

}
