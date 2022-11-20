package main;

import entities.House;
import entities.Member;
import logic.MemberService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Member> members = new ArrayList<>();
    public static ArrayList<House> houses = new ArrayList<>();

    public static void main(String[] args) {

    }

    private static void runMenu() {

    }

    private static void displayMenu() {
        System.out.println("------------------MENU------------------");
        System.out.println("1, Member Service");
        System.out.println("2, House Service");
        System.out.println("3, Exit");
        System.out.println("----------------------------------------");
    }

    private static void logicFunction(Scanner scanner) {
        int functionChoice;
        do {
            System.out.print("Choose function: ");
            functionChoice = Integer.parseInt(scanner.next());
            if (functionChoice >= 1 && functionChoice <= 3) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        switch (functionChoice) {
            case 1:
                System.out.println("@@@ CHOOSE FUNCTION @@@");
                System.out.println("1, Add members");
                System.out.println("2, Display members");
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@");
                System.out.print("Choose function: ");
                int memberFunctionChoice;
                do {
                    memberFunctionChoice = Integer.parseInt(scanner.next());
                    if (memberFunctionChoice == 1 || memberFunctionChoice == 2) {
                        break;
                    }
                } while (true);
                switch (memberFunctionChoice) {
                    case 1:
                        break;
                    case 2:
                        break;
                }
                break;
            case 2:
                break;
            case 3:
                System.exit(0);
        }
    }
}
