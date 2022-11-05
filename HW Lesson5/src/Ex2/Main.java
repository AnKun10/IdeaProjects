package Ex2;

import Ex1.Student;

//Bài 2: Sử dụng lớp sinh viên trong bài 1, nhập vào danh sách n sinh viên và thực hiện:
//a. In toàn bộ danh sách ra màn hình
//b. Sắp xếp danh sách theo tên sinh viên
//c. In danh sách sinh viên theo lớp
public class Main {
    public static void main(String[] args) {
        Student students = new Student();
        Student[] studentsList = students.list();
        //Part a
        students.print(studentsList);
        //Part b

    }
}
