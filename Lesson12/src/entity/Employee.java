package entity;

public class Employee {
    private String lecturer;
    private String manager;

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "lecturer='" + lecturer + '\'' +
                ", manager='" + manager + '\'' +
                '}';
    }
}
