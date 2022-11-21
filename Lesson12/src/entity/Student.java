package entity;

public class Student {
    private int id;
    private String name;
    private int age;
    private double mark;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "entity.Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", mark='" + mark + '\'' +
                '}';
    }
}
