package DAO;

import Beans.Issue;
import Beans.Issues;

import java.util.ArrayList;

public interface IssuesInterface {

    public ArrayList<Issues> getLatestIssues(); // within week
    public ArrayList<Issues> searchIssues(String query);

}
