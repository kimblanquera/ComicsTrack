package CallAPI;

import java.net.URL;
import java.util.ArrayList;
import java.lang.String;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import org.json.JSONArray;
import org.json.JSONObject;

import static javax.json.Json.createParser;

public class CallAPIImplementation implements CallAPIInterface {



    /*public ArrayList makeCall(String query) throws Exception {


        ArrayList results = new ArrayList();

        URL obj = new URL(query);
        System.out.println(obj);

        //GetRequest request = Unirest.get(query);
        HttpResponse<JsonNode> jsonResponse = Unirest.get(query).header("accept", "application/json").asJson();
        JSONObject res = jsonResponse.getBody().getObject();
        JSONArray r = res.getJSONArray("results");
        //return r;
    }

    public ArrayList browseAll() {
        return null;
    }*/
}
