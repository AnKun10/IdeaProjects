package view;

import entity.User;
import main.Main;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuPage {
    public void runMain() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            display();
            logicFunction(Main.users, Main.user, scanner);
        }
    }

    public void display() {
        System.out.println("----------------MENU---------------");
        System.out.println("1, Login");
        System.out.println("2, Register");
        System.out.println("3, Exit");
        System.out.println("-----------------------------------");
    }

    public void logicFunction(ArrayList<User> users, User user, Scanner scanner) {
        int functionChoice = choiceFunction(scanner);
        switch (functionChoice) {
            case 1:
                while (true) {
                    Main.userFunction.setReturnToMenuPage(false);
                    user = Main.userFunction.login(users, scanner); //User Login
                    if (user == null || Main.userFunction.isReturnToMenuPage()) {
                        break;
                    }
                    do {
                        Main.mainPage.display();
                        Main.userFunction.mainPageFunction(users, user, scanner);
                        if (Main.userFunction.isReturnToMenuPage()) { //User Logout
                            System.out.println("Returning to Menu Page!");
                            break;
                        }
                    } while (true);
                    if (Main.userFunction.isReturnToMenuPage()) {
                        break;
                    }
                }
                break;
            case 2:
                Main.userFunction.register(users, scanner);
                break;
            case 3:
                System.exit(0);
        }
    }

    private int choiceFunction(Scanner scanner) {
        int functionChoice = 0;
        do {
            System.out.print("Choose function: ");
            String functionChoiceTemp = scanner.nextLine();
            if (Main.verifyType.isInt(functionChoiceTemp)) {
                functionChoice = Integer.parseInt(functionChoiceTemp);
            }
            if (functionChoice >= 1 && functionChoice <= 3) {
                break;
            }
            System.out.print("Invalid Input, please try again!");
        } while (true);
        return functionChoice;
    }
}
