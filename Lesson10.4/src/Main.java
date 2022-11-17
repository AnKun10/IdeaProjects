import entity.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setMark(8);
        student.classify();
        student.display();
    }
}
