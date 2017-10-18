package Beans;

import java.util.ArrayList;

public class Volume {
    private String name;
    private String ID;
    private String aliases;
    private String firstIssue;
    private String lastIssue;
    private String characterCredits;
    private int issueCount;
    private String startYear;
    private String teamCredits;
    private String publisher;
    private ArrayList<Images> img;

    public Volume(String n, String id, String a, String first, String last, String cc, int ic, String sy, String tc, String pub, ArrayList<Images> im) {
        this.name = n;
        this.ID = id;
        this.aliases = a;
        this.firstIssue = first;
        this.lastIssue = last;
        this.characterCredits = cc;
        this.issueCount = ic;
        this.startYear = sy;
        this.teamCredits = tc;
        this.publisher = pub;
        this.img = im;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAliases() {
        return aliases;
    }

    public void setAliases(String aliases) {
        this.aliases = aliases;
    }

    public String getFirstIssue() {
        return firstIssue;
    }

    public void setFirstIssue(String firstIssue) {
        this.firstIssue = firstIssue;
    }

    public String getLastIssue() {
        return lastIssue;
    }

    public void setLastIssue(String lastIssue) {
        this.lastIssue = lastIssue;
    }

    public String getCharacterCredits() {
        return characterCredits;
    }

    public void setCharacterCredits(String characterCredits) {
        this.characterCredits = characterCredits;
    }

    public int getIssueCount() {
        return issueCount;
    }

    public void setIssueCount(int issueCount) {
        this.issueCount = issueCount;
    }

    public String getStartYear() {
        return startYear;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }

    public String getTeamCredits() {
        return teamCredits;
    }

    public void setTeamCredits(String teamCredits) {
        this.teamCredits = teamCredits;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public ArrayList<Images> getImg() {
        return img;
    }

    public void setImg(ArrayList<Images> img) {
        this.img = img;
    }
}
