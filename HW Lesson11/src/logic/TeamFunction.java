package logic;

import entity.Champion;
import entity.Team;
import main.Main;

import java.util.ArrayList;
import java.util.Scanner;

public class TeamFunction implements Addable, Displayable {
    //Create new Team
    private Team input(Scanner scanner) {
        Team team = new Team();
        ArrayList<Champion> champions = new ArrayList<>();
        //Add 5 Champion to the Team
        for (int i = 0; i < 5; i++) {
            int champId;
            //Find Champion's id
            System.out.print("Enter "+(i+1)+" champion's id: ");
            champId = Integer.parseInt(scanner.next());
            boolean hasChamp = false;
            for (Champion champion : Main.champions) {
                if (champId == champion.getId()) {
                    hasChamp = true;
                    //User add 2 same Champion
                    if (champions.contains(champion)) {
                        System.out.println("This team already has this champion, please try again!");
                        i--;
                        break;
                    }
                    //User successfully add Team to Champions List
                    champions.add(champion);
                }
            }
            //User doesn't add an existing Champion's id
            if (!hasChamp) {
                System.out.println("There aren't any champion with this id, please try again!");
                i--;
            }
        }
        team.setChampions(champions);
        return team;
    }
    //Add new Teams
    @Override
    public void add(Scanner scanner) {
        //Not enough Champions
        if (Main.champions.size()<5){
            System.out.println("Not enough Champions to create Team, please try again!");
            return;
        }
        //Create Teams
        int teamNumb;
        do {
            System.out.print("Enter number of new teams: ");
            teamNumb = Integer.parseInt(scanner.next());
            if (teamNumb > 0) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        for (int i = 0; i < teamNumb; i++) {
            System.out.println("@@@ Team "+(i+1)+" @@@");
            Main.teams.add(input(scanner));
        }
    }
    //Display Teams
    @Override
    public void display() {
        if (Main.teams.size()==0){
            System.out.println("\tThere aren't any Teams yet!");
        }
        for (Team team : Main.teams) {
            System.out.println("\t" + team);
        }
    }
}
