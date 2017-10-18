package sample;

import Beans.Issues;
import CallAPI.CallAPIImplementation;
import DAO.IssuesImpl;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import CallAPI.CallAPIInterface;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import DBConnect.DBConnectFactory;


public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        String title = "WELCOME";
        /*try {
            dbCon = DBConnectFactory.getInstance();
            conn = dbCon.getConnection();
            title = "It worked!";
            conn.close();
        }
        catch(SQLException ex) {
            title = "You suck!";
        }*/
        Parent root = FXMLLoader.load(getClass().getResource("layout.fxml"));
        primaryStage.setTitle(title);
        primaryStage.setScene(new Scene(root, 1200, 720));
        primaryStage.show();

        /*CallAPIImplementation apicall = new CallAPIImplementation();
        try {
            //apicall.makeCall("http://comicvine.gamespot.com/api/characters/?api_key=84cc8db84d81dce614ffe25859905ba5f758699c&sort=name&field_list=name&format=json");
        }
        catch(Exception e) {
            e.printStackTrace();
        }*/

    }


    public static void main(String[] args) {
        launch(args);
    }

}
