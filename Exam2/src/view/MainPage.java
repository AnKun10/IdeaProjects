package view;

import main.Main;

import java.util.Scanner;

public class MainPage {
    public void display() {
        System.out.println("--------------FUNCTIONS------------");
        System.out.println("1, Change Username");
        System.out.println("2, Change Email");
        System.out.println("3, Change Password");
        System.out.println("4, Logout");
        System.out.println("5, Exit");
        System.out.println("-----------------------------------");
    }

    public int choiceFunction(Scanner scanner) {
        int functionChoice = 0;
        do {
            System.out.print("Choose function: ");
            String functionChoiceTemp = scanner.nextLine();
            if (Main.verifyType.isInt(functionChoiceTemp)) {
                functionChoice = Integer.parseInt(functionChoiceTemp);
            }
        } while (functionChoice < 1 || functionChoice > 5);
        return functionChoice;
    }
}
