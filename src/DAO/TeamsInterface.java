package DAO;

import Beans.Teams;

import java.util.ArrayList;

public interface TeamsInterface {

    public ArrayList<Teams> getAllTeams();
    public ArrayList<Teams> searchTeams(String query);

}
