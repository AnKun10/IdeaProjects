package entity;

import java.util.ArrayList;

public class Team {
    private int id;
    private ArrayList<Champion> champions;
    private static int autoId = 0;

    public Team(){
        autoId++;
        this.id = autoId;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Champion> getChampions() {
        return champions;
    }

    public void setChampions(ArrayList<Champion> champions) {
        this.champions = champions;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", champions=" + champions +
                '}';
    }
}
