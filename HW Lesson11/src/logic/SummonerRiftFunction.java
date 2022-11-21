package logic;

import entity.Team;
import main.Main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class SummonerRiftFunction implements Addable, Displayable {
    @Override
    //Create 2 new Teams for Summoner Rift
    public void add(Scanner scanner) {
        //Not enough Teams
        if (Main.teams.size() < 2) {
            System.out.println("Not enough Teams to create Summoner Rift, please try again!");
            return;
        }
        //Create Teams List
        ArrayList<Team> teams = new ArrayList<>();
        int teamId;
        for (int i = 0; i < 2; i++) {
            boolean hasTeam = false;
            //Find Team's id
            System.out.print("Enter team " + (i + 1) + " id: ");
            teamId = Integer.parseInt(scanner.next());
            for (Team team : Main.teams) {
                if (team.getId() == teamId) {
                    hasTeam = true;
                    //User add 2 same team
                    if (teams.contains(team)) {
                        System.out.println("This Match already has this team, please try again!");
                        i--;
                        break;
                    }
                    //User successfully add Team to Teams List
                    teams.add(team);
                }
            }
            //User doesn't add an existing Team's id
            if (!hasTeam) {
                System.out.println("There aren't any team with this id, please try again!");
                i--;
            }
        }
        Main.summonerRift.setTeams(teams);
    }

    //Display Summoner Rift
    @Override
    public void display() {
        if (Main.summonerRift.getTeams() == null){
            System.out.println("\tThere aren't any Matches!");
            return;
        }
        System.out.println("\t" + Main.summonerRift);
        System.out.println("\tMatch start at: " + LocalDateTime.now());
    }
}
