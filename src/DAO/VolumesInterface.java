package DAO;

import Beans.Volumes;

import java.util.ArrayList;

public interface VolumesInterface {

    public ArrayList<Volumes> getAllVolumes();
    public ArrayList<Volumes> searchVolumes(String query);

}
