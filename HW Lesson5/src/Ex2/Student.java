package Ex2;

import java.util.Scanner;

public class Student {
    public String Id;
    public String Name;
    public String Class;
    public String AcademicYear;

    @Override
    public String toString() {
        return "Student{" +
                "Id='" + Id + '\'' +
                ", Name='" + Name + '\'' +
                ", Class='" + Class + '\'' +
                ", AcademicYear='" + AcademicYear + '\'' +
                '}';
    }

    public void information(){
        System.out.print("Enter Id: ");
        this.Id = new Scanner(System.in).nextLine();
        System.out.print("Enter Name: ");
        this.Name = new Scanner(System.in).nextLine();
        System.out.print("Enter Class: ");
        this.Class = new Scanner(System.in).nextLine();
        System.out.print("Enter Academic Year: ");
        this.AcademicYear = new Scanner(System.in).nextLine();
    }

    public Student[] list(){
        System.out.print("Enter number of students:");
        int numbers = new Scanner(System.in).nextInt();
        Student[] students = new Student[numbers];
        for (int i = 0; i < numbers; i++) {
            System.out.println("Student "+(i+1)+" info:");
            students[i] = new Student();
            students[i].information();
        }
        return students;
    }

    public void print(Student[] students){
        for (int i = 0; i < students.length; i++) {
            System.out.println((i+1)+": "+students[i]);
        }
    }

    public void sortName(Student[] students){

    }
}