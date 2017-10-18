package DAO;

import Beans.ListItem;
import Beans.ReadingOrder;
import java.util.ArrayList;

public interface ReadingOrderInterface {

    public ArrayList<ReadingOrder> getAllReadingOrders();
    public ReadingOrder getReadingOrderByID(String ID);
    public ArrayList<ReadingOrder> getReadingOrderByType(String type);
    public ReadingOrder getReadingOrderByBase(String base);

    // ADD
    public Boolean addToReadingOrder(ListItem item, String listID);

    // EDIT
    public Boolean editReadingOrderName(String listID, String newName);

    // DELETE
    public Boolean removeIssueFromReadingOrder(ListItem item, String listID);
    public Boolean deleteReadingOrder(String listID);

    // CREATE
    public Boolean makeNewReadingOrder(String ID, String type, String name);
}
