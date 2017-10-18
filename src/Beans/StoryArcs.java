package Beans;

import java.util.ArrayList;

public class StoryArcs {
    private String name;
    private String ID;
    private String desc;
    private String publisher;
    private ArrayList<Images> img;

    public StoryArcs(String n, String i, String d, String pub, ArrayList<Images> im) {
        this.name = n;
        this.ID = i;
        this.desc = d;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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
