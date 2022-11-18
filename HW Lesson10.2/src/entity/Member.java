package entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Member implements Inputable {
    private int id;
    private String name;
    private LocalDate dob;
    private String job;
    private static int autoId = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "entity.Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", job='" + job + '\'' +
                '}';
    }


    @Override
    public void inputInfo() {
        autoId++;
        id = autoId;
        System.out.print("Enter name: ");
        name = new Scanner(System.in).next();
        System.out.print("Enter date of birth: ");
        String date = new Scanner(System.in).next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        dob = LocalDate.parse(date,formatter);
        System.out.print("Enter job: ");
        job = new Scanner(System.in).next();

    }
}
