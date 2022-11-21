package main;

import entity.Champion;
import entity.SummonerRift;
import entity.Team;
import logic.ChampionFunction;
import logic.SummonerRiftFunction;
import logic.TeamFunction;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Champion> champions = new ArrayList<>();
    public static ArrayList<Team> teams = new ArrayList<>();
    public static SummonerRift summonerRift = new SummonerRift();
    public static ChampionFunction championFunction = new ChampionFunction();
    public static TeamFunction teamFunction = new TeamFunction();
    public static SummonerRiftFunction summonerRiftFunction = new SummonerRiftFunction();

    public static void main(String[] args) {
        runMain();
    }

    private static void runMain() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayMenu();
            logicMenu(scanner);
        }
    }

    private static void displayMenu() {
        System.out.println("-------------------SUMMONER RIFT-----------------");
        System.out.println("1, Add entity");
        System.out.println("2, Display entity");
        System.out.println("3, Exit");
        System.out.println("-------------------------------------------------");
    }

    private static void displayMenuFunctionAdd() {
        System.out.println("===== ADD FUNCTION =====");
        System.out.println("1, Champions");
        System.out.println("2, Teams");
        System.out.println("3, Summoner Rift");
        System.out.println("4, Exit");
        System.out.println("========================");
    }

    private static void displayMenuFunctionDisplay() {
        System.out.println("===== DISPLAY FUNCTION =====");
        System.out.println("1, Champions");
        System.out.println("2, Teams");
        System.out.println("3, Summoner Rift");
        System.out.println("4, Exit");
        System.out.println("============================");
    }

    private static void logicMenu(Scanner scanner) {
        int functionChoice;
        do {
            System.out.print("Choose function: ");
            functionChoice = Integer.parseInt(scanner.next());
            if (functionChoice > 0 && functionChoice < 4) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        switch (functionChoice) {
            case 1:
                displayMenuFunctionAdd();
                logicMenuFunctionAdd(scanner);
                break;
            case 2:
                displayMenuFunctionDisplay();
                logicMenuFunctionDisplay(scanner);
                break;
            case 3:
                System.exit(0);
        }
    }

    private static void logicMenuFunctionAdd(Scanner scanner) {
        int functionChoice;
        do {
            System.out.print("Choose function: ");
            functionChoice = Integer.parseInt(scanner.next());
            if (functionChoice > 0 && functionChoice < 5) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        switch (functionChoice) {
            case 1:
                championFunction.add(scanner);
                break;
            case 2:
                teamFunction.add(scanner);
                break;
            case 3:
                summonerRiftFunction.add(scanner);
                break;
            case 4:
                return;
        }
    }

    private static void logicMenuFunctionDisplay(Scanner scanner) {
        int functionChoice;
        do {
            System.out.print("Choose function: ");
            functionChoice = Integer.parseInt(scanner.next());
            if (functionChoice > 0 && functionChoice < 5) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        switch (functionChoice) {
            case 1:
                championFunction.display();
                break;
            case 2:
                teamFunction.display();
                break;
            case 3:
                summonerRiftFunction.display();
                break;
            case 4:
                return;
        }
    }
}
