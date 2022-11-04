package Student;

public class Student {
    public String id;
    public String name;
    public String address;
    public String gender;
    public String faculty;
    public double gpa;

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", faculty='" + faculty + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
