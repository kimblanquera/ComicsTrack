package DAO;

import Beans.ListItem;

import java.util.ArrayList;

public interface ListItemInterface {

    public ArrayList<ListItem> getAllListItems(String listID);
    public ArrayList<ListItem> getAllListItemsByTag(String[] tags);

}
