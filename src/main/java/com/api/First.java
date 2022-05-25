package com.api;


	import static io.restassured.RestAssured.given;
	public class First {

		public static void main(String[] args) {
			given().
			
			
			get("http://216.10.245.166/Library/GetBook.php?AuthorName=somename")
			.then()
			.log()
			.all();
				
		}
	}


