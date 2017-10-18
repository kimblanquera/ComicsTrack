package DAO;
import Beans.UserBean;

public interface UserInterface {

    public boolean addUser(UserBean u);

    public boolean editUser(UserBean u);

    public boolean deleteUser(UserBean u);

}
