package Ex1;

import java.util.Arrays;
import java.util.Scanner;

//Bài 1: Viết chương trình tạo lập lớp Sinh viên với các thuộc tính mã sinh viên, tên sinh viên, lớp, khóa. Khởi tạo
//một sinh viên với các giá trị nhập từ bàn phím. In thông tin sinh viên ra màn hình.
public class Main {
    public static void main(String[] args) {
        Student students = new Student();
        Student[] studentsList = students.list();
        students.print(studentsList);
    }
}
