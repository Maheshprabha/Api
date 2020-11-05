package com.atmecs.testscripts;

import java.net.URL;

import com.atmecs.testdata.UsersDataProvider;

public class GetUserAplTest {
	@Test(dataProvider = "userdata" , dataProviderClass = UsersDataProvider.class)
	public void testGetUserApi(String url, String firstName,String lastName) {
		String requestUrl = url;
		RequestSpecification request = RestAssured.given();
		Response response = request.get(new URL(requestUrl));
		int statuscode = response.getStatusCode();
		String body = response.getBody().asString();
		JsonPath jsonPath = response.jsonPath();
		String actualFirstName = jsonPath.get ("data.first_name");
		String actualLastName = jsonPath.get ("data.last_name");
		Assert.assertEquals(actualFirstName,firstName);
		Assert.assertEquals(actualLastName,lastName);
		Assert.assertEquals(statusCode,200,"Verify status code");
		System.out.println("FirstName = " + actualFirstName);
		
		System.out.println("LastName = " + actualLastName);
		System.out.println("Status code = " + statusCode);
		System.out.println("Response body = " + body);

	}

}
