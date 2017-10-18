package Beans;

import java.util.ArrayList;

public class Issue {
    private String aliases;
    private String charCredits;
    private String coverDate;
    private String id;
    private ArrayList<Images> img;
    private String issueNum;
    private String name;
    private String storyArcCredits;
    private String teamCredits;
    private String volume;

    public Issue(String a, String cc, String cd, ArrayList<Images> im, String i, String in, String n, String sac, String tc, String vol) {
        this.aliases = a;
        this.charCredits = cc;
        this.coverDate = cd;
        this.id = i;
        this.img = im;
        this.issueNum = in;
        this.name = n;
        this.storyArcCredits = sac;
        this.teamCredits = tc;
        this.volume = vol;
    }

    public String getAliases() {
        return aliases;
    }

    public void setAliases(String aliases) {
        this.aliases = aliases;
    }

    public String getCharCredits() {
        return charCredits;
    }

    public void setCharCredits(String charCredits) {
        this.charCredits = charCredits;
    }

    public String getCoverDate() {
        return coverDate;
    }

    public void setCoverDate(String coverDate) {
        this.coverDate = coverDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIssueNum() {
        return issueNum;
    }

    public void setIssueNum(String issueNum) {
        this.issueNum = issueNum;
    }

    public ArrayList<Images> getImg() {
        return img;
    }

    public void setImg(ArrayList<Images> img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStoryArcCredits() {
        return storyArcCredits;
    }

    public void setStoryArcCredits(String storyArcCredits) {
        this.storyArcCredits = storyArcCredits;
    }

    public String getTeamCredits() {
        return teamCredits;
    }

    public void setTeamCredits(String teamCredits) {
        this.teamCredits = teamCredits;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }
}
