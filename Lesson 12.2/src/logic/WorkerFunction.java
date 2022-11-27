package logic;

import entity.Worker;
import main.Main;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkerFunction {
    private Worker input(Scanner scanner) {
        Worker worker = new Worker();
        System.out.print("Enter name: ");
        worker.setName(scanner.next());
        System.out.print("Enter age: ");
        worker.setAge(Main.checkType.newInt(scanner));
        System.out.print("Enter salary: ");
        worker.setSalary(Main.checkType.newDouble(scanner));
        System.out.print("Enter work place: ");
        worker.setWorkPlace(scanner.next());
        return worker;
    }

    public void add(Scanner scanner, ArrayList<Worker> workers) {
        int workerNumb = 0;
        System.out.print("Enter number of new workers: ");
        workerNumb = Main.checkType.newInt(scanner);
        for (int i = 0; i < workerNumb; i++) {
            do {
                Worker worker = null;
                try {
                    worker = input(scanner);
                    workers.add(worker);
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input!");
                }
            } while (true);
        }
    }

    public void display(ArrayList<Worker> workers) {
        for (Worker worker : workers) {
            System.out.println("\t" + worker);
        }
    }

    public void updateSalary(Scanner scanner, ArrayList<Worker> workers) {
        if (workers.size()==0){
            System.out.println("There aren't any worker!");
            return;
        }
        System.out.print("Enter salary: ");
        double updateSalary = Main.checkType.newDouble(scanner);
        for (Worker worker : workers) {
            worker.setSalary(updateSalary);
        }
    }
}
