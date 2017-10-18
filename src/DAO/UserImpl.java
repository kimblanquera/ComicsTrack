package DAO;

import Beans.UserBean;
import DBConnect.DBConnectFactory;
import DAO.UserInterface;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserImpl implements UserInterface {

    private Connection conn;
    private DBConnectFactory dbCon;


    @Override
    public boolean addUser(UserBean u) {
        try {
            dbCon = DBConnectFactory.getInstance();
            conn = dbCon.getConnection();
            String query = "INSERT into user(userID, firstName, lastName, photoURL) values (?, ?, ?, ?);";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, u.getUserID());
            ps.setString(2, u.getFirstName());
            ps.setString(3, u.getLastName());
            ps.setString(4, u.getPhotoUrl());

            ps.executeUpdate();
            conn.close();
            return true;
        }
        catch(SQLException ex) {
            Logger.getLogger(UserImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean editUser(UserBean u) {
        try {
            dbCon = DBConnectFactory.getInstance();
            conn = dbCon.getConnection();
            String query = "UPDATE user set userID = ?, firstName = ?, lastName = ?, photoURL = ?;";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, u.getUserID());
            ps.setString(2, u.getFirstName());
            ps.setString(3, u.getLastName());
            ps.setString(4, u.getPhotoUrl());

            ps.executeUpdate();
            conn.close();
            return true;
        }
        catch(SQLException ex) {
            Logger.getLogger(UserImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean deleteUser(UserBean u) {
        return false;
    }
}
