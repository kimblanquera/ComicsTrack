package Beans;

import java.util.ArrayList;

public class Publisher {
    private String name;
    private String ID;
    private ArrayList<Images> img;
    private String characters;
    private String storyArcs;
    private String volumes;

    public Publisher(String n, String i, ArrayList<Images> im, String c, String sa, String v) {
        this.name = n;
        this.ID = i;
        this.img = im;
        this.characters = c;
        this.storyArcs = sa;
        this.volumes = v;
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

    public String getCharacters() {
        return characters;
    }

    public void setCharacters(String characters) {
        this.characters = characters;
    }

    public String getStoryArcs() {
        return storyArcs;
    }

    public void setStoryArcs(String storyArcs) {
        this.storyArcs = storyArcs;
    }

    public String getVolumes() {
        return volumes;
    }

    public void setVolumes(String volumes) {
        this.volumes = volumes;
    }
}
