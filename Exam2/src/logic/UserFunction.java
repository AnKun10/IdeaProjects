package logic;

import entity.User;
import main.Main;
import view.MainPage;

import java.util.ArrayList;
import java.util.Scanner;

import static main.Main.verifyInfo;

public class UserFunction {
    public boolean returnToMenuPage;

    public boolean isReturnToMenuPage() {
        return returnToMenuPage;
    }

    public void setReturnToMenuPage(boolean returnToMenuPage) {
        this.returnToMenuPage = returnToMenuPage;
    }

    private User input(ArrayList<User> users, Scanner scanner) {
        String username; //Create Username
        do {
            System.out.print("1, Enter username: ");
            username = scanner.nextLine();
            if (verifyInfo.verifyRegisterUsername(users, username)) {
                break;
            }
            System.out.println("Invalid Username, please try again!");
        } while (true);

        String email; //Create Email
        do {
            System.out.print("2, Enter email: ");
            email = scanner.nextLine();
            if (verifyInfo.verifyRegisterEmail(users, email)) {
                break;
            }
            System.out.println("Invalid Email, please try again!");
        } while (true);

        String password; //Create Password
        do {
            System.out.print("3, Enter password [7-15 Characters; at least 1 Capital Letter; at least 1 Special Character (. , - _ ;)]: ");
            password = scanner.nextLine();
            if (verifyInfo.verifyRegisterPassword(password)) {
                break;
            }
            System.out.println("Invalid Password, please try again!");
        } while (true);
        return new User(username, email, password); //Successfully Create new User
    }

    public void register(ArrayList<User> users, Scanner scanner) {
        users.add(input(users, scanner)); //Register new User to Server
        System.out.println("Successfully Registered! Moving to the Menu Page ...");
    }

    public User login(ArrayList<User> users, Scanner scanner) {
        User user;
        // Verify User X's Username
        String username;
        do {
            System.out.print("1, Enter Username: ");
            username = scanner.nextLine();
            user = verifyInfo.verifyLoginUsername(users, username); //Find User X
            if (user != null) {
                break;
            }
            //Wrong Username Function
            //Case 1: Re-enter Username
            //Case 2: Register new User
            //Case 3: Return to Menu Page
            if (choiceUsernameFailedFunction(scanner) == 2) { //Case 2
                register(users, scanner);
                return null;
            } else if (choiceUsernameFailedFunction(scanner) == 3) { //Case 3
                System.out.println("Returning to Menu Page!");
                setReturnToMenuPage(true);
                return null;
            }
        } while (true);
        // Verify User X's Password
        String password;
        do {
            System.out.print("2, Enter Password: ");
            password = scanner.nextLine();
            if (verifyInfo.verifyLoginPassword(user, password)) { //Check Password
                break;
            }
            //Wrong Password Function
            //Case 1: Re-enter Password
            //Case 2: New Password
            //Case 3: Return to Menu Page
            int choice = choicePasswordFailedFunction(scanner);
            if (choice == 2) { //Case 2
                System.out.println("### Please enter your Email to change Password ###");
                do {
                    System.out.print("\tEnter email: ");
                    String email = scanner.nextLine();
                    if (verifyInfo.verifyLoginEmail(user, email)) { //Check Email
                        do {
                            System.out.print("\tEnter new Password: "); //Enter new Password
                            String newPassword = scanner.nextLine();
                            if (verifyInfo.verifyRegisterPassword(newPassword)) { //Check new Password
                                user.setPassword(newPassword);
                                System.out.println("Successfully Change Password! Returning to Menu Page"); //Successfully change Password
                                setReturnToMenuPage(true);
                                return user;
                            }
                            System.out.println("\tInvalid Password, please try again!");
                        } while (true);
                    }
                    System.out.println("\tInvalid Email, please try again!");
                } while (true);
            } else if (choice == 3) { //Case 3
                System.out.println("Returning to Menu Page!");
                setReturnToMenuPage(true);
                return user;
            }
            System.out.println("Invalid Password, please try again!");
        } while (true);
        System.out.println("Welcome " + user.getUsername() + "! Processing to Main Page ...");
        return user;
    }


    public void mainPageFunction(ArrayList<User> users, User user, Scanner scanner) { //True: User Stay in the Main Page / False: User Quit Main Page
        switch (Main.mainPage.choiceFunction(scanner)) {
            case 1:
                changeUsernameFunction(users, user, scanner);
                break;
            case 2:
                changeEmailFunction(users, user, scanner);
                break;
            case 3:
                changePasswordFunction(user, scanner);
                break;
            case 4:
                setReturnToMenuPage(true);
                return;
            case 5:
                System.exit(0);
        }
    }

    private void changePasswordFunction(User user, Scanner scanner) {
        String newPassword;
        do {
            System.out.print("Enter new Password: ");
            newPassword = scanner.nextLine();
            if (verifyInfo.verifyRegisterPassword(newPassword)) {
                user.setPassword(newPassword);
                System.out.println("Successfully Change Password!");
                break;
            }
            System.out.println("Invalid Password, please try again!");
        } while (true);
    }

    private void changeEmailFunction(ArrayList<User> users, User user, Scanner scanner) {
        String newEmail;
        do {
            System.out.print("Enter new Email: ");
            newEmail = scanner.nextLine();
            if (verifyInfo.verifyRegisterEmail(users, newEmail)) {
                user.setEmail(newEmail);
                System.out.println("Successfully Change Email!");
                break;
            }
            System.out.println("Invalid Email, please try again!");
        } while (true);
    }

    private void changeUsernameFunction(ArrayList<User> users, User user, Scanner scanner) {
        String newUsername;
        do {
            System.out.print("Enter new Username: ");
            newUsername = scanner.nextLine();
            if (verifyInfo.verifyRegisterUsername(users, newUsername)) {
                user.setUsername(newUsername);
                System.out.println("Successfully Change Username!");
                break;
            }
            System.out.println("Invalid Username, please try again!");
        } while (true);
    }

    private int choicePasswordFailedFunction(Scanner scanner) {// User choose Function when Enter wrong Password
        System.out.println("Invalid Password, please choose a Function to continue:");
        System.out.println("\t1) Re-enter Password");
        System.out.println("\t2) Forget Password");
        System.out.println("\t3) Back to the Menu Page");
        int functionChoice = 0;
        do {
            System.out.print("\tChoose function: ");
            String functionChoiceTemp = scanner.nextLine();
            if (Main.verifyType.isInt(functionChoiceTemp)) {
                functionChoice = Integer.parseInt(functionChoiceTemp);
                if (functionChoice >= 1 && functionChoice <= 3) {
                    break;
                }
            }
            System.out.println("\tInvalid Input, please try again!");
        } while (true);
        return functionChoice;
    }

    private int choiceUsernameFailedFunction(Scanner scanner) {// User choose Function when Enter wrong Username
        System.out.println("Invalid Username, please choose a Function to continue:");
        System.out.println("\t1) Re-enter Username");
        System.out.println("\t2) Register new User");
        System.out.println("\t3) Back to the Menu Page");
        int functionChoice = 0;
        do {
            System.out.print("\tChoose function: ");
            String functionChoiceTemp = scanner.nextLine();
            if (Main.verifyType.isInt(functionChoiceTemp)) {
                functionChoice = Integer.parseInt(functionChoiceTemp);
                if (functionChoice >= 1 && functionChoice <= 3) {
                    break;
                }
            }
            System.out.println("\tInvalid Input, please try again!");
        } while (true);
        return functionChoice;
    }
}
