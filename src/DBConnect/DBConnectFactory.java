package DBConnect;

import java.sql.Connection;

public abstract class DBConnectFactory {
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:8889/comics_track";
    private String username ="root";
    private String password = "hpotter3";

    public static DBConnectFactory getInstance() {
        return new DBConnectImpl();
    }

    public abstract Connection getConnection();

    public String getDriver() {
        return driver;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getUrl() {
        return url;
    }
}
