package com.api;
import static io.restassured.RestAssured.given;

public class Delete {
	public static void main(String[] args) {
		given()
		.log()
		.all()
		.when()
		.delete("https://dummy.restapiexample.com/api/v1/delete/3")
		.then()
		.log()
		.all();
	}


}
