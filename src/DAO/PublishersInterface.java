package DAO;

import Beans.Publishers;
import java.util.ArrayList;

public interface PublishersInterface {

    public ArrayList<Publishers> getAllPublishers();
    public ArrayList<Publishers> searchPublishers(String query);
}
