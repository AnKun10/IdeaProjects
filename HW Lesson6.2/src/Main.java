import Entity.Student;
import Entity.Subject;

import java.util.Scanner;

public class Main {

    public static Student[] students = new Student[90000];
    public static Subject[] subjects = new Subject[900];

    public static void main(String[] args) {
        while (true) {
            functionMenu();
            functionExecute(functionChoice());
        }
    }

    public static void functionMenu() {
        System.out.println("---------------UNIVERSITY MENU--------------");
        System.out.println("       ~~~Please select a function~~~       ");
        System.out.println("1, Nhập danh sách sinh viên mới. In ra danh sách sinh viên sau khi nhập");
        System.out.println("2, Nhập danh sách môn học mới. In ra danh sách môn học sau khi nhập");
        System.out.println("3, Nhập điểm cho mỗi sinh viên đã có và in danh sách ra màn hình.");
        System.out.println("4, Sắp xếp danh sách Bảng điểm\n" +
                "a. Theo Họ tên sinh viên\n" +
                "b. Theo Tên Môn học");
        System.out.println("5, Tính điểm tổng kết chung cho mỗi sinh viên dựa trên điểm môn học và số đơn vị học trình của môn học đó.");
        System.out.println("6, Thoát chương trình");
        System.out.println("--------------------------------------------");
    }

    public static int functionChoice() {
        int functionChoice;
        do {
            System.out.print("Execute a function: ");
            functionChoice = new Scanner(System.in).nextInt();
            if (functionChoice >= 1 && functionChoice <= 6) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        return functionChoice;
    }

    public static void functionExecute(int functionChoice) {
        switch (functionChoice) {
            case 1:
                addStudent();
                displayStudentInfo();
                break;
            case 2:
                addSubject();
                displaySubjectInfo();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                System.exit(0);
        }
    }

    public static void addStudent() {
        System.out.print("Enter number of new students: ");
        int numb = new Scanner(System.in).nextInt();
        for (int i = 0; i < numb; i++) {
            Student student = new Student();
            student.infoInput();
            for (int j = 0; j < students.length; j++) {
                if (students[j] == null) {
                    students[j] = student;
                    break;
                }
            }
        }
    }

    public static void addSubject() {
        System.out.print("Enter number of new subjects: ");
        int numb = new Scanner(System.in).nextInt();
        for (int i = 0; i < numb; i++) {
            Subject subject = new Subject();
            subject.infoInput();
            for (int j = 0; j < subjects.length; j++) {
                if (subjects[j] == null) {
                    subjects[j] = subject;
                    break;
                }
            }
        }
    }

    public static void displayStudentInfo() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println((i + 1) + ", " + students[i]);
            }
        }
    }

    public static void displaySubjectInfo() {
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] != null) {
                System.out.println((i + 1) + ", " + subjects[i]);
            }
        }
    }
}
