package entity;

import java.util.Scanner;

public class Route implements Inputable{
    private int id;
    private double distance;
    private int stop;
    private int AUTO_ID = 99;

    public Route() {
        AUTO_ID++;
        this.id = AUTO_ID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getStop() {
        return stop;
    }

    public void setStop(int stop) {
        this.stop = stop;
    }

    @Override
    public String toString() {
        return "Route{" +
                "id=" + id +
                ", distance=" + distance +
                ", stop=" + stop +
                '}';
    }

    @Override
    public void inputInfo() {
        System.out.print("Enter distance: ");
        this.distance = new Scanner(System.in).nextDouble();
        System.out.print("Enter number of stops: ");
        this.stop = new Scanner(System.in).nextInt();
    }
}
