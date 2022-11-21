package main;

import entity.Employee;
import entity.Student;
import logic.EmployeeFunction;
import logic.StudentFunction;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Student> students = new ArrayList<>();
    public static Employee employee = new Employee();
    public static StudentFunction studentFunction = new StudentFunction();
    public static EmployeeFunction employeeFunction = new EmployeeFunction();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        employeeFunction.add(scanner);
        studentFunction.add(scanner);
        employeeFunction.display();
        studentFunction.display();
    }
}
