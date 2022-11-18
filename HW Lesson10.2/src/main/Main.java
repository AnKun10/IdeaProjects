package main;

import entity.Member;
import logic.MemberService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Member> members = new ArrayList<>();

    public static void main(String[] args) {
        runMenu();
    }

    private static void runMenu() {
        while (true) {
            displayMenu();
            int functionChoice = choiceFunction();
            logicFunction(functionChoice);
        }
    }

    private static void displayMenu() {
        System.out.println("------------------MENU------------------");
        System.out.println("1, Add members");
        System.out.println("2, Display members");
        System.out.println("3, Exit");
        System.out.println("----------------------------------------");
    }

    private static int choiceFunction() {
        int functionChoice;
        do {
            System.out.print("Choose function: ");
            functionChoice = new Scanner(System.in).nextInt();
            if (functionChoice >= 1 && functionChoice <= 3) {
                break;
            }
            System.out.println("Invalid input");
        } while (true);
        return functionChoice;
    }

    private static void logicFunction(int functionChoice) {
        switch (functionChoice) {
            case 1:
                MemberService.add();
                break;
            case 2:
                MemberService.display();
                break;
            case 3:
                System.exit(0);
        }
    }
}
