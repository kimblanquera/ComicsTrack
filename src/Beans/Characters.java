package Beans;

public class Characters {
    private String id;
    private String icon;
    private String mediumImage;
    private String smallImage;
    private String publisher;
    private String gender;

    public Characters(String i, String ic, String medImg, String smallImg, String pub, String gen) {
        this.id = i;
        this.icon = ic;
        this.mediumImage = medImg;
        this.smallImage = smallImg;
        this.publisher = pub;
        this.gender = gen;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
