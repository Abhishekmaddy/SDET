package excelConnection;


import ApiTesting.HeaderClass;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


import java.util.LinkedList;

public class Rest {

    public void ApiTriggerClass() {

        try {

            HeaderClass headerClass = new HeaderClass();
            LinkedList<Header> lh = headerClass.Header_v1();

            Headers hrds = new Headers(lh);

            String baseUrl = "https://restful-booker.herokuapp.com";
            String endUrl = "/auth";


            RestAssured.baseURI = baseUrl + endUrl;

            //initialization  of the restassured request
            RequestSpecification rs = RestAssured.given().log().all();

            rs.headers(hrds);


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


            //Response


        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    public static void main(String[] args) {
        Rest atc = new Rest();

        atc.ApiTriggerClass();

    }
}


