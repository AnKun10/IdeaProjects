package entity;

import java.util.ArrayList;

public class SummonerRift {
    private ArrayList<Team> teams;

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    @Override
    public String toString() {
        return "SummonerRift{" +
                "teams=" + teams +
                '}';
    }
}
