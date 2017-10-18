package Beans;

import java.util.ArrayList;

public class StoryArc {
    private int issueCount;
    private String desc;
    private String ID;
    private ArrayList<Images> img;
    private String issues;
    private String publisher;

    public StoryArc(int ic, String d, String id, ArrayList<Images> im, String is, String pub) {
        this.desc = d;
        this.ID = id;
        this.img = im;
        this.issueCount = ic;
        this.issues = is;
        this.publisher = pub;
    }

    public int getIssueCount() {
        return issueCount;
    }

    public void setIssueCount(int issueCount) {
        this.issueCount = issueCount;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public ArrayList<Images> getImg() {
        return img;
    }

    public void setImg(ArrayList<Images> img) {
        this.img = img;
    }

    public String getIssues() {
        return issues;
    }

    public void setIssues(String issues) {
        this.issues = issues;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
