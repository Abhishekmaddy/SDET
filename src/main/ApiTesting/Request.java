package ApiTesting;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;

import java.util.Iterator;

public class Request {

    public void Test() throws ParseException {


        String baseUrl = "";
        String endUrl = "";

        String body ="";
        RestAssured.baseURI =baseUrl+endUrl;

        RequestSpecification requestSpec = RestAssured.given().log().all();

        requestSpec.headers("Content-Type" , "application-Type");
        requestSpec.queryParam("");
        requestSpec.body(body);

        Response response = requestSpec.request(Method.POST, RestAssured.baseURI);

        String responseBody = response.getBody().asString().trim();
        int responseCode= response.getStatusCode();
        Assert.assertEquals(responseCode, 200);

        JSONParser jp = new JSONParser();
        JSONObject jo = (JSONObject) jp.parse(responseBody);
        JSONArray ja =(JSONArray) jo.get("qwer");
        Iterator<?> itr = ja.iterator();

        while(itr.hasNext()){

        }











    }
}
