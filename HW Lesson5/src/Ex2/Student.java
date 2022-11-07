package Ex2;

import java.util.Scanner;

public class Student {
    public String Id;
    public String Name;
    public String Class;
    public String AcademicYear;

    //Students List Method
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

//    Sorting Method
    public void sortName(Student[] students){
        sortName(students, 0, students.length-1);
    }
    public void sortName(Student[] students, int LowIndex, int HighIndex){
        String pivot = students[HighIndex].Name;
        int RightPointer = HighIndex;
        int LeftPointer = LowIndex;
        if (LeftPointer >= RightPointer){
            return;
        }
        while (LeftPointer < RightPointer){
            while ((students[LeftPointer].Name).compareTo(pivot) <= 0 && LeftPointer < RightPointer){
                LeftPointer++;
            }
            while ((students[RightPointer].Name).compareTo(pivot) >= 0 && LeftPointer < RightPointer){
                RightPointer--;
            }
            swap(students, LeftPointer, RightPointer);
        }
        swap(students,LeftPointer, HighIndex);
        sortName(students, LowIndex, LeftPointer-1);
        sortName(students, LeftPointer+1, HighIndex);
    }
    public void swap(Student[] students, int index1, int index2){
        Student temp = students[index1];
        students[index1] = students[index2];
        students[index2] = temp;
    }
}