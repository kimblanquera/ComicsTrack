package Beans;

public class IssueList {
    String ID; // can be issueID or volumeID
    String listType;
    String listName;
    //String orderBase; // basis for reading orders
    //String orderType; // event or character


    // for reading orders
    /*public IssueList(String id, String lt, String ln, String ob, String ot) {
        this.ID = id;
        this.listType = lt;
        this.listName = ln;
        this.orderBase = ob;
        this.orderType = ot;
    }*/



    // for user-created lists
    public IssueList(String id, String lt, String ln) {
        //super(id, lt, ln);
        this.ID = id;
        this.listType = lt;
        this.listName = ln;
    }



    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getListType() {
        return listType;
    }

    public void setListType(String listType) {
        this.listType = listType;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

}
