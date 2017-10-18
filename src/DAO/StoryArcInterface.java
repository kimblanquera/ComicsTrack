package DAO;

import Beans.StoryArc;
import java.util.ArrayList;

public interface StoryArcInterface {

    public ArrayList<StoryArc> getAllStoryArcs();
    public StoryArc getStoryArcByID(String ID);

}
