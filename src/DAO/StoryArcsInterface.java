package DAO;

import Beans.StoryArc;
import Beans.StoryArcs;

import java.util.ArrayList;

public interface StoryArcsInterface {

    public ArrayList<StoryArcs> getAllStoryArcs();
    public ArrayList<StoryArcs> searchStoryArcs(String query);

}
