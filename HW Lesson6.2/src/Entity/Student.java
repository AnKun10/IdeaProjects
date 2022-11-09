package Entity;

import Entity.Person;

import java.util.Scanner;

public class Student extends Person {
    private int id;
    private String speciality;
    private int AUTO_ID = 0;
    public Student(){
        if (AUTO_ID == 0){
            AUTO_ID = 9999;
        }
        AUTO_ID++;
        this.id = AUTO_ID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Entity.Student{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", id=" + id +
                ", speciality='" + speciality + '\'' +
                '}';
    }

    @Override
    public void infoInput() {
        super.infoInput();
        System.out.print("Enter student speciality : ");
        this.speciality = new Scanner(System.in).next();
    }
}
