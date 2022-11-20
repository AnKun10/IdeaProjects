package entity;

import entity.Follower;

import java.util.ArrayList;

public class Idol {
    private int id;
    private String name;
    private String email;
    private String group;
    private ArrayList<Follower> followers;
    private static int autoId = 0;

    public Idol(){
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public ArrayList<Follower> getFollowers() {
        return followers;
    }

    public void setFollowers(ArrayList<Follower> followers) {
        this.followers = followers;
    }

    @Override
    public String toString() {
        return "entity.Idol{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", group='" + group + '\'' +
                ", followers=" + followers +
                '}';
    }
}
