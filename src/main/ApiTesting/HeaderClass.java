package ApiTesting;

import io.restassured.http.Header;

import java.util.LinkedList;

public class HeaderClass {



    public LinkedList<Header> Header_v1() {


        LinkedList<Header> headersList = new LinkedList<>();
        try {

            //headersList.add(new Header("api", apiKey));
            headersList.add(new Header("Content-Type", "application/json"));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return headersList;
    }


//    public LinkedList<Header> Header_v2(String apiKey) {
//
//
//        LinkedList<Header> headersList = new LinkedList<>();
//        try {
//
//            //headersList.add(new Header("api", apiKey));
//            headersList.add(new Header("Content-Type", "application/json"));
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return headersList;
//    }

}
