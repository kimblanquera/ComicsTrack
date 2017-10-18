package Beans;

import java.util.ArrayList;

public class Volumes {
    private String name;
    private String ID;
    private String startYear;
    private String publisher;
    private ArrayList<Images> img;

    public Volumes(String n, String i, String sy, String pub, ArrayList<Images> im) {
        this.name = n;
        this.ID = i;
        this.startYear = sy;
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

    public String getStartYear() {
        return startYear;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
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
