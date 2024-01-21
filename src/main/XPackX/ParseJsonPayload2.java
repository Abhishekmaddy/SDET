package XPackX;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;

public class ParseJsonPayload2 {

    public static void assertKeyValuePairInEntireJson(JSONObject actualJson, String key) {
        boolean exists = actualJson.has(key.toString());
        Iterator<?> keys;
        String nextKeys;

        if (!exists) {
            keys = actualJson.keys();
            while (keys.hasNext()) {
                nextKeys = (String) keys.next();
                try {// if the object is json object
                    if (actualJson.get(nextKeys) instanceof JSONObject) {
                        // Recursive call
                        assertKeyValuePairInEntireJson(actualJson.getJSONObject(nextKeys), key);
                        // if the object is json array
                    } else if (actualJson.get(nextKeys) instanceof JSONArray) {
                        JSONArray jsonarray = actualJson.getJSONArray(nextKeys);
                        for (int i = 0; i < jsonarray.length(); i++) {
                            String jsonArrayString = jsonarray.get(i).toString();
                            JSONObject innerJson = new JSONObject(jsonArrayString);
                            if (exists ==false){
                                assertKeyValuePairInEntireJson(innerJson, key);
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else {
            assertKeyValue(actualJson, key);
        }
    }
    public static void assertKeyValue(JSONObject actualJson, String key) {
        System.out.println(actualJson.get(key));

    }

    public static void main(String[] args) {

        String input = "{\n" +
                "\"problems\": [{\n" +
                "    \"Diabetes\":[{\n" +
                "        \"medications\":[{\n" +
                "            \"medicationsClasses\":[{\n" +
                "                \"className\":[{\n" +
                "                    \"associatedDrug\":[{\n" +
                "                        \"name\":\"asprin\",\n" +
                "                        \"dose\":\"\",\n" +
                "                        \"strength\":\"500 mg\"\n" +
                "                    }],\n" +
                "                    \"associatedDrug#2\":[{\n" +
                "                        \"name\":\"somethingElse\",\n" +
                "                        \"dose\":\"\",\n" +
                "                        \"strength\":\"500 mg\"\n" +
                "                    }]\n" +
                "                }],\n" +
                "                \"className2\":[{\n" +
                "                    \"associatedDrug\":[{\n" +
                "                        \"name\":\"asprin\",\n" +
                "                        \"dose\":\"\",\n" +
                "                        \"strength\":\"500 mg\"\n" +
                "                    }],\n" +
                "                    \"associatedDrug#2\":[{\n" +
                "                        \"name\":\"somethingElse\",\n" +
                "                        \"dose\":\"\",\n" +
                "                        \"strength\":\"500 mg\"\n" +
                "                    }]\n" +
                "                }]\n" +
                "            }]\n" +
                "        }],\n" +
                "        \"labs\":[{\n" +
                "            \"missing_field\": \"missing_value\"\n" +
                "        }]\n" +
                "    }],\n" +
                "    \"Asthma\":[{}]\n" +
                "}]}";

        JSONObject inputJSONObject = new JSONObject(input);
        assertKeyValuePairInEntireJson(inputJSONObject, "name");


        ArrayList<?> aar = new ArrayList<>();
    }
}