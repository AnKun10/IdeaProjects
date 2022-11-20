package entities;

import java.time.LocalDate;

public class Member {
    private int id;
    private String name;
    private LocalDate dob;
    private String job;
    private static int autoId = 0;

    public Member() {
        autoId++;
        this.id = autoId;
    }

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
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", job='" + job + '\'' +
                '}';
    }
}
