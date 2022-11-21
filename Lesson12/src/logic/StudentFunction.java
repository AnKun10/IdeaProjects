package logic;

import entity.Student;
import main.Main;

import java.util.Scanner;

public class StudentFunction implements Addable, Displayable {
    private Student input(Scanner scanner) {
        Student student = new Student();
        System.out.print("Enter name: ");
        student.setName(scanner.next());
        do {
            boolean rightFormat = true;
            try {
                System.out.print("Enter mark: ");
                student.setMark(Double.parseDouble(scanner.next()));
            } catch (Exception e) {
                rightFormat = false;
            }
            if (rightFormat && student.getMark() >= 0 && student.getMark() <= 4) {
                break;
            }
            System.out.println("Invalid format, try again!");
        } while (true);

        do {
            boolean rightFormat = true;
            try {
                System.out.print("Enter age: ");
                student.setAge(Integer.parseInt(scanner.next()));
            } catch (Exception e) {
                rightFormat = false;
            }
            if (rightFormat && student.getAge()>0) {
                break;
            }
            System.out.println("Invalid format, try again!");
        } while (true);

        return student;
    }

    @Override
    public void add(Scanner scanner) {
        int studentNumb = 0;
        do {
            boolean rightFormat = true;
            try {
                System.out.print("Enter number of new students: ");
                studentNumb = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                rightFormat = false;
            }
            if (rightFormat && studentNumb > 0) {
                break;
            }
            System.out.println("Invalid format, try again!");
        } while (true);

        for (int i = 0; i < studentNumb; i++) {
            Main.students.add(input(scanner));
        }
    }


    @Override
    public void display() {
        for (Student student : Main.students) {
            System.out.println("\t" + student);
        }
    }


}
