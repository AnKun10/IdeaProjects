package main;

import entity.Worker;
import logic.CheckType;
import logic.WorkerFunction;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Worker> workers = new ArrayList<>();
    private static WorkerFunction workerFunction = new WorkerFunction();
    public static CheckType checkType = new CheckType();

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

    private static void logicMenu(Scanner scanner) {
        System.out.print("Choose function: ");
        int functionChoice = Integer.parseInt(scanner.next());
        switch (functionChoice) {
            case 1:
                workerFunction.add(scanner,workers);
                break;
            case 2:
                workerFunction.display(workers);
                break;
            case 3:
                workerFunction.updateSalary(scanner,workers);
                break;
            case 4:
                System.exit(0);
        }
    }

    private static void displayMenu() {
        System.out.println("-----------------MENU----------------");
        System.out.println("1, Add workers");
        System.out.println("2, Display workers");
        System.out.println("3, Update worker's salary");
        System.out.println("4, Exit");
        System.out.println("-------------------------------------");
    }
}
