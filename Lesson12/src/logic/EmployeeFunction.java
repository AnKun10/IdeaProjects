package logic;

import entity.Employee;
import main.Main;

import java.util.Scanner;

public class EmployeeFunction implements Addable, Displayable {
    @Override
    public void add(Scanner scanner) {
        Employee employee = new Employee();
        System.out.print("Enter lecture name: ");
        Main.employee.setLecturer(scanner.next());
        System.out.print("Enter manager name: ");
        Main.employee.setManager(scanner.next());
    }

    @Override
    public void display() {
        System.out.println("Lecture: "+Main.employee.getLecturer());
        System.out.println("Manager: "+Main.employee.getManager());
    }
}
