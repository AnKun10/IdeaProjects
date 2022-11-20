package main;

import entity.Follower;
import entity.Idol;
import entity.Song;
import entity.Tiktok;
import logic.FollowerService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Song> songs = new ArrayList<>();
    public static ArrayList<Follower> followers = new ArrayList<>();
    public static ArrayList<Idol> idols = new ArrayList<>();
    public static ArrayList<Tiktok> tiktoks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }

    private static void displayFunctionMain() {
        System.out.println("----------------------MENU---------------------");
        System.out.println("1, Add entity");
        System.out.println("2, Display entity");
        System.out.println("3, Exit");
        System.out.println("-----------------------------------------------");
    }

    private static void displayFunctionAdd() {
        System.out.println("\n=== ADD FUNCTION ===");
        System.out.println("1, Followers");
        System.out.println("2, Idols");
        System.out.println("3, Songs");
        System.out.println("4, Tiktoks");
        System.out.println("5, Back to the menu");
        System.out.println("====================\n");
    }

    private static void displayFunctionDisplay() {
        System.out.println("\n=== DISPLAY FUNCTION ===");
        System.out.println("1, Followers");
        System.out.println("2, Idols");
        System.out.println("3, Songs");
        System.out.println("4, Tiktoks");
        System.out.println("5, Back to the menu");
        System.out.println("========================\n");
    }

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
                break;
            case 3:
                System.exit(0);
        }
    }

    private static void logicFunctionAdd(Scanner scanner) {
        int functionChoiceMain;
        FollowerService followerService = new FollowerService();
        do {
            System.out.print("Choose function: ");
            functionChoiceMain = Integer.parseInt(scanner.next());
            if (functionChoiceMain >= 1 && functionChoiceMain <= 5) {
                break;
            }
            System.out.println("Invalid input, please try again!\n");
        } while (true);
        switch (functionChoiceMain) {
            case 1:
                followerService.add(scanner);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                return;
        }
    }
}
