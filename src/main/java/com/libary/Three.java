package com.libary;
import static io.restassured.RestAssured.given;

public class Three {
	public static void main(String[] args) {
		
	given().
	get("http://216.10.245.166/Library/GetBook.php?AuthorName=F. Scott Fitzgerald")
	.then()
	.log()
	.all();
	
	
	}
}
