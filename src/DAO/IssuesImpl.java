package DAO;

import Beans.Issue;
import Beans.Issues;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import org.json.JSONArray;
import org.json.JSONObject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class IssuesImpl implements IssuesInterface {
    private final String USER_AGENT = "Mozilla/5.0";
    String resultFormat = "&format=json";
    private String urlStr = "http://comicvine.gamespot.com/api/";
    private String key = "?api_key=84cc8db84d81dce614ffe25859905ba5f758699c";
    private String issuesSearch = "issues/";


    public ArrayList<Issues> getLatestIssues() {
        ArrayList<Issues> issues = new ArrayList<Issues>();
        try {
            String url = urlStr + issuesSearch + key + "&filter=cover_date:2017-09-24%7C2017-10-01" + resultFormat;
            System.out.println(url);
            HttpResponse<JsonNode> jsonResponse = Unirest.get(url).header("accept", "application/json").asJson();
            JSONObject res = jsonResponse.getBody().getObject();
            JSONArray r = res.getJSONArray("results");
            //System.out.println(r.getJSONObject(1).get("name"));
            for(int c = 0; c < r.length(); c++) {
                Issues is = new Issues(r.getJSONObject(c).get("name").toString(), r.getJSONObject(c).get("cover_date").toString(), r.getJSONObject(c).get("volume").toString(), r.getJSONObject(c).get("id").toString(), r.getJSONObject(c).get("image"));
                issues.add(is);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return issues;
    }

    public ArrayList<Issues> searchIssues(String query) {
        ArrayList<Issues> issues = new ArrayList<Issues>();
        try {
            String url = urlStr + issuesSearch + key + "&filter=name:" + query + resultFormat;
            System.out.println(url);
            HttpResponse<JsonNode> jsonResponse = Unirest.get(url).header("accept", "application/json").asJson();
            JSONObject res = jsonResponse.getBody().getObject();
            JSONArray r = res.getJSONArray("results");
            //System.out.println(r.getJSONObject(1).get("name"));
            for(int c = 0; c < r.length(); c++) {
                Issues is = new Issues(r.getJSONObject(c).get("name").toString(), r.getJSONObject(c).get("cover_date").toString(), r.getJSONObject(c).get("volume").toString(), r.getJSONObject(c).get("id").toString(), r.getJSONObject(c).get("image"));
                issues.add(is);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        return issues;
    }

    /*public Issue getIssue(String id) {
        //Issue oneIssue = new Issue();
        //return oneIssue;
    }*/
}
