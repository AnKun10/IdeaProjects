package Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number of students = ");
        int number = new Scanner(System.in).nextInt();
        Student[] student = new Student[number];
        for (int i = 0; i < number; i++) {
            student[i] = new Student();
            System.out.println("Enter id = ");
            student[i].id = new Scanner(System.in).nextLine();
            System.out.println("Enter name = ");
            student[i].name = new Scanner(System.in).nextLine();
            System.out.println("Enter address = ");
            student[i].address = new Scanner(System.in).nextLine();
            System.out.println("Enter gender = ");
            student[i].gender = new Scanner(System.in).nextLine();
            System.out.println("Enter faculty = ");
            student[i].faculty = new Scanner(System.in).nextLine();
            System.out.println("Enter gpa = ");
            student[i].gpa = new Scanner(System.in).nextDouble();
        }
    }

}
