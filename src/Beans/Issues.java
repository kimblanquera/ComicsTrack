package Beans;

import org.json.JSONArray;

import java.util.ArrayList;

public class Issues {
    private String name;
    private String coverDate;
    private String volume;
    private String ID;
    private Object img;

    public Issues(String n, String cd, String v, String id, Object im) {
        this.name = n;
        this.coverDate = cd;
        this.volume = v;
        this.ID = id;
        this.img = im;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoverDate() {
        return coverDate;
    }

    public void setCoverDate(String coverDate) {
        this.coverDate = coverDate;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Object getImg() {
        return img;
    }

    public void setImg(Object img) {
        this.img = img;
    }
}