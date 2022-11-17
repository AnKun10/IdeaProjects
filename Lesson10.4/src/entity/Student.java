package entity;

import constant.MarkConstant;

public class Student implements Classifiable, Displayable {
    public String name;
    public int age;
    public int mark;
    public String classification;

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

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                ", classification='" + classification + '\'' +
                '}';
    }

    @Override
    public void classify() {
        if (mark >= 8) {
            classification = MarkConstant.A.value;
        } else if (mark < 8 && mark > 6.5) {
            classification = MarkConstant.B.value;
        } else {
            classification = MarkConstant.C.value;
        }
    }

    @Override
    public void display() {
        System.out.println("name: " + name);
        System.out.println("mark: " + mark);
        System.out.println("age: " + age);
        System.out.println("classification: " + classification);
    }
}
