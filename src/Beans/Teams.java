package Beans;

import java.util.ArrayList;

public class Teams {
    private String name;
    private String ID;
    private ArrayList<Images> img;

    public Teams(String n, String i, ArrayList<Images> im) {
        this.name = n;
        this.ID = i;
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

    public ArrayList<Images> getImg() {
        return img;
    }

    public void setImg(ArrayList<Images> img) {
        this.img = img;
    }
}
