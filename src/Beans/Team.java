package Beans;

import java.util.ArrayList;

public class Team {
    private String name;
    private String ID;
    private String aliases;
    private String desc;
    private String issueCredits;
    private String storyArcCredits;
    private String volumeCredits;
    private String publisher;
    private String characters;
    private ArrayList<Images> img;

    public Team(String n, String i, String a, String d, String is, String sac, String vc, String pub, String c, ArrayList<Images> im) {
        this.name = n;
        this.ID = i;
        this.aliases = a;
        this.desc = d;
        this.issueCredits = is;
        this.storyArcCredits = sac;
        this.volumeCredits = vc;
        this.publisher = pub;
        this.characters = c;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getIssueCredits() {
        return issueCredits;
    }

    public void setIssueCredits(String issueCredits) {
        this.issueCredits = issueCredits;
    }

    public String getStoryArcCredits() {
        return storyArcCredits;
    }

    public void setStoryArcCredits(String storyArcCredits) {
        this.storyArcCredits = storyArcCredits;
    }

    public String getVolumeCredits() {
        return volumeCredits;
    }

    public void setVolumeCredits(String volumeCredits) {
        this.volumeCredits = volumeCredits;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCharacters() {
        return characters;
    }

    public void setCharacters(String characters) {
        this.characters = characters;
    }

    public ArrayList<Images> getImg() {
        return img;
    }

    public void setImg(ArrayList<Images> img) {
        this.img = img;
    }
}
