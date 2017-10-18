package Beans;

public class Character {
    private String aliases;
    private int issueCount;
    private String deck;
    private String ID;
    private String icon;
    private String mediumImage;
    private String smallImage;
    private String issues;
    private String name;
    private String realName;
    private String storyArcCredits;
    private String teams;
    private String volumeCredits;
    private String publisher;

    public Character(String al, int iscount, String desc, String id, String ic, String medImg, String smallImg, String iss, String n, String rn, String sac, String t, String vol, String pub) {
        this.aliases = al;
        this.issueCount = iscount;
        this.deck = desc;
        this.ID = id;
        this.icon = ic;
        this.mediumImage = medImg;
        this.smallImage = smallImg;
        this.issues = iss;
        this.name = n;
        this.realName = rn;
        this.storyArcCredits = sac;
        this.teams = t;
        this.volumeCredits = vol;
        this.publisher = pub;
    }

    public String getAliases() {
        return aliases;
    }

    public void setAliases(String aliases) {
        this.aliases = aliases;
    }

    public int getIssueCount() {
        return issueCount;
    }

    public void setIssueCount(int issueCount) {
        this.issueCount = issueCount;
    }

    public String getDeck() {
        return deck;
    }

    public void setDeck(String deck) {
        this.deck = deck;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getMediumImage() {
        return mediumImage;
    }

    public void setMediumImage(String mediumImage) {
        this.mediumImage = mediumImage;
    }

    public String getSmallImage() {
        return smallImage;
    }

    public void setSmallImage(String smallImage) {
        this.smallImage = smallImage;
    }

    public String getIssues() {
        return issues;
    }

    public void setIssues(String issues) {
        this.issues = issues;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getStoryArcCredits() {
        return storyArcCredits;
    }

    public void setStoryArcCredits(String storyArcCredits) {
        this.storyArcCredits = storyArcCredits;
    }

    public String getTeams() {
        return teams;
    }

    public void setTeams(String teams) {
        this.teams = teams;
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


}
