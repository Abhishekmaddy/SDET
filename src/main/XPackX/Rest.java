package XPackX;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Rest {
    public static void main(String[] args) {


        String baseUrl = "https://restful-booker.herokuapp.com";
        String endUrl = "/auth";


        RestAssured.baseURI = baseUrl + endUrl;

        //initialization  of the restassured request
        RequestSpecification rs = RestAssured.given().log().all();

        //rs.headers(hrds);


        String requestBody = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        rs.when().body(requestBody);

        Response resp = rs.request(Method.POST, RestAssured.baseURI);
        int status = resp.getStatusCode();

        //Assert.assertEquals(status, 200);
        String responseBody = resp.getBody().asString().trim();
        System.out.println(responseBody);
    }
}
