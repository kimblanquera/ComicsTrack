package DAO;

import Beans.Characters;
import Beans.Team;

import java.util.ArrayList;

public interface CharactersInterface {

   public ArrayList<Characters> getAllCharacters();
   public ArrayList<Characters> getAllCharactersByFilter(String filter);
   public ArrayList<Characters> getAllCharactersByStoryArc(String storyArcName);
   public ArrayList<Characters> getAllCharactersByTeam(Team team);

}
