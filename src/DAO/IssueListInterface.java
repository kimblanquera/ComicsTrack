package DAO;

import Beans.Issue;
import Beans.IssueList;
import Beans.ListItem;
import Beans.Volume;

import java.util.ArrayList;

public interface IssueListInterface {

    // VIEW
    public ArrayList<IssueList> getAllIssueLists();
    public IssueList getIssueListByID(String ID);
    public ArrayList<IssueList> getIssueListByType(String type);


    // ADD
    public Boolean addIssueToList(ListItem item, String listID);
    public Boolean addVolumeToList(Volume volume, String listID);

    // EDIT
    public Boolean editListName(String listID, String newName);

    // DELETE
    public Boolean removeAllIssues(String listID);
    public Boolean removeIssueFromList(ListItem item, String listID);
    public Boolean deleteList(String listID);

    // CREATE
    public Boolean makeNewList(String ID, String type, String name);

}
