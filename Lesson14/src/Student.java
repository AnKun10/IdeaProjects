public class Student {
    private int id;
    private String name;
    private double score;
    private int age;
    private static int autoId = 0;

    public Student(String name, double score, int age) {
        this.id = ++autoId;
        this.name = name;
        this.score = score;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score='" + score + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
