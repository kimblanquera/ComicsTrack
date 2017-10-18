package Beans;

public class ListItem {
    String listID;
    String dateAdded;
    String issueID;
    String[] tags;

    public ListItem(String ld, String da, String id, String[] t) {
        this.listID = ld;
        this.dateAdded = da;
        this.issueID = id;
        this.tags = t;
    }

    public String getListID() {
        return listID;
    }

    public void setListID(String listID) {
        this.listID = listID;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getIssueID() {
        return issueID;
    }

    public void setIssueID(String issueID) {
        this.issueID = issueID;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

}
