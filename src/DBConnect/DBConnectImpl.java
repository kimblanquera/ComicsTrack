package DBConnect;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnectImpl extends DBConnectFactory {

    @Override
    public Connection getConnection() {
        try {
            Class.forName(getDriver());
            Connection connect = DriverManager.getConnection(getUrl(), getUsername(), getPassword());
            return connect;
        }
        catch (SQLException ex){
            //Logger.getLogger(DBConnectImpl.class.getName()).log(Level.SEVERE, null,e));
            Logger.getLogger(DBConnectImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnectImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
