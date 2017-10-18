package sample;

import Beans.Issues;
import DAO.IssuesImpl;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

import DBConnect.DBConnectFactory;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Controller implements Initializable{
    @FXML
    GridPane resultsGrid;

    public Label hello;
    private Connection conn;
    private DBConnectFactory dbCon;

    public void initConnection(ActionEvent actionEvent) {

        try {
            dbCon = DBConnectFactory.getInstance();
            conn = dbCon.getConnection();
            //title = "It worked!";
            conn.close();
        }
        catch(SQLException ex) {
            //title = "You suck!";
        }
    }

    public void testIssues() {
        ArrayList<Issues> issuesList = new ArrayList<Issues>();
        IssuesImpl testCall = new IssuesImpl();
        int row = 0, col = 0;
        double pos = 5.0;
        try {
            issuesList = testCall.searchIssues("aquaman");
            for(Issues issue : issuesList) {
                Label issueName = new Label();
                if(issue.getName() != "null") {
                    issueName.setText(col + " | " + row + " | " + issue.getName());
                    issueName.setWrapText(true);
                    issueName.setTextFill(Color.WHITE);
                    resultsGrid.setConstraints(issueName, col, row);
                    resultsGrid.getChildren().add(issueName);
                    if(col == 2) {
                        col = 0;
                        row++;
                        RowConstraints r = new RowConstraints();
                        r.setMinHeight(10.0);
                        resultsGrid.getRowConstraints().add(r);
                    }
                    else {
                        col++;
                    }
                }
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        testIssues();
    }

}
