//package XPackX;
//
//public class JsonPath {
//
//        public static void main(String[] args) {
//            // Assuming you have the JSON as a string
//            String jsonString = "{\n" +
//                    "  \"name\": \"John Doe\",\n" +
//                    "  \"age\": 30,\n" +
//                    "  \"address\": {\n" +
//                    "    \"city\": \"New York\",\n" +
//                    "    \"zipcode\": \"10001\"\n" +
//                    "  },\n" +
//                    "  \"contacts\": [\n" +
//                    "    {\n" +
//                    "      \"type\": \"email\",\n" +
//                    "      \"value\": \"john.doe@example.com\"\n" +
//                    "    },\n" +
//                    "    {\n" +
//                    "      \"type\": \"phone\",\n" +
//                    "      \"value\": \"555-1234\"\n" +
//                    "    }\n" +
//                    "  ]\n" +
//                    "}";  // Replace with your JSON string
//
//            // Use JsonPath to extract values
//            String name = JsonPath.read(jsonString, "$.name");
//            String city = JsonPath.read(jsonString, "$.address.city");
//            String email = JsonPath.read(jsonString, "$.contacts[0].value");
//
//            // Print the extracted values
//            System.out.println("Name: " + name);
//            System.out.println("City: " + city);
//            System.out.println("Email: " + email);
//        }
//    }
//
