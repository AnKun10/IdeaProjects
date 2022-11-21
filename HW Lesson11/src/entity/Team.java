package entity;

import java.util.ArrayList;

public class Team {
    private int id;
    private ArrayList<Champion> champions;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Champion> getChampions() {
        return champions;
    }

    public void setChampions(ArrayList<Champion> champions) {
        this.champions = champions;
    }


}
