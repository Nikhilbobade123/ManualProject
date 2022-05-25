package com.api;
import static io.restassured.RestAssured.given;

public class Put {
	public static void main(String[] args) {
		given()
		.header("Content-Type","application/json")
		.header("Authorization","Bearer 2dae294e29123c15223a8a4d78543f46b2fae9291391f53abfcfc20843e3f3d5")
		.body("{" +
	            "    \"name\": \"Nikhil Bobade\"," +
	            "    \"gender\": \"male\"," +
	            "    \"email\": \"nikbobde7322@gmail.com\"," +
	            "    \"status\": \"active\"" +
	            "}")
		.when()
		.put("	https://dummy.restapiexample.com/api/v1/update/21")
		.then().log().all();
	}


}
