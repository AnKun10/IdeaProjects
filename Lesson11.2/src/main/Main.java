package main;

import entity.Follower;
import entity.Idol;
import entity.Song;
import entity.Tiktok;
import logic.FollowerService;
import logic.IdolService;
import logic.SongService;
import logic.TiktokService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Song> songs = new ArrayList<>();
    public static ArrayList<Follower> followers = new ArrayList<>();
    public static ArrayList<Idol> idols = new ArrayList<>();
    public static ArrayList<Tiktok> tiktoks = new ArrayList<>();
    public static FollowerService followerService = new FollowerService();
    public static IdolService idolService = new IdolService();
    public static SongService songService = new SongService();
    public static TiktokService tiktokService = new TiktokService();

    public static void main(String[] args) {
        runMain();
    }
    //MAIN: Run
    private static void runMain() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayFunctionMain();
            logicFunctionMain(scanner);
        }
    }
    //MAIN: Menu
    private static void displayFunctionMain() {
        System.out.println("\n----------------------MENU---------------------");
        System.out.println("1, Add entity");
        System.out.println("2, Display entity");
        System.out.println("3, Exit");
        System.out.println("-----------------------------------------------");
    }
    //MAIN: Add Menu
    private static void displayFunctionAdd() {
        System.out.println("\n=== ADD FUNCTION ===");
        System.out.println("1, Followers");
        System.out.println("2, Idols");
        System.out.println("3, Songs");
        System.out.println("4, Tiktoks");
        System.out.println("5, Back to the menu");
        System.out.println("====================");
    }
    //MAIN: Display Menu
    private static void displayFunctionDisplay() {
        System.out.println("\n=== DISPLAY FUNCTION ===");
        System.out.println("1, Followers");
        System.out.println("2, Idols");
        System.out.println("3, Songs");
        System.out.println("4, Tiktoks");
        System.out.println("5, Back to the menu");
        System.out.println("========================");
    }
    //Logic: Handle Main Menu Function Choice
    private static void logicFunctionMain(Scanner scanner) {
        int functionChoiceMain;
        do {
            System.out.print("Choose function: ");
            functionChoiceMain = Integer.parseInt(scanner.next());
            if (functionChoiceMain >= 1 && functionChoiceMain <= 3) {
                break;
            }
            System.out.println("Invalid input, please try again!\n");
        } while (true);
        switch (functionChoiceMain) {
            case 1:
                displayFunctionAdd();
                logicFunctionAdd(scanner);
                break;
            case 2:
                displayFunctionDisplay();
                logicFunctionDisplay(scanner);
                break;
            case 3:
                System.exit(0);
        }
    }
    //Logic: Handle Add Menu Function Choice
    private static void logicFunctionAdd(Scanner scanner) {
        int functionChoiceAdd;
        do {
            System.out.print("Choose function: ");
            functionChoiceAdd = Integer.parseInt(scanner.next());
            if (functionChoiceAdd >= 1 && functionChoiceAdd <= 5) {
                break;
            }
            System.out.println("Invalid input, please try again!\n");
        } while (true);
        switch (functionChoiceAdd) {
            case 1:
                followerService.add(scanner);
                break;
            case 2:
                if (followers.size() == 0) {
                    System.out.println("Error: There aren't any Followers in the data to create Idols!");
                    return;
                }
                idolService.add(scanner);
                break;
            case 3:
                songService.add(scanner);
                break;
            case 4:
                if (idols.size() == 0) {
                    System.out.println("Error: There aren't any Idols in the data to create Tiktoks!");
                    return;
                }
                if (songs.size() == 0) {
                    System.out.println("Error: There aren't any Songs in the data to create Tiktoks!");
                    return;
                }
                tiktokService.add(scanner);
                break;
            case 5:
                return;
        }
    }
    //Logic: Handle Display Menu Function Choice
    private static void logicFunctionDisplay(Scanner scanner) {
        int functionChoiceDisplay;
        do {
            System.out.print("Choose function: ");
            functionChoiceDisplay = Integer.parseInt(scanner.next());
            if (functionChoiceDisplay >= 1 && functionChoiceDisplay <= 5) {
                break;
            }
            System.out.println("Invalid input, please try again!\n");
        } while (true);
        switch (functionChoiceDisplay) {
            case 1:
                if (followers.size()==0){
                    System.out.println("\tThere aren't any Followers in the data!");
                }
                followerService.display();
                break;
            case 2:
                if (idols.size()==0){
                    System.out.println("\tThere aren't any Idols in the data!");
                }
                idolService.display();
                break;
            case 3:
                if (songs.size()==0){
                    System.out.println("\tThere aren't any Songs in the data!");
                }
                songService.display();
                break;
            case 4:
                if (tiktoks.size()==0){
                    System.out.println("\tThere aren't any Tiktoks in the data!");
                }
                tiktokService.display();
                break;
            case 5:
                return;
        }
    }
}
