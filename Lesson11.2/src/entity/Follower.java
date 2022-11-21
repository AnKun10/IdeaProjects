package entity;

public class Follower {
    private int id;
    private String name;
    private String email;
    private int likeNumb;
    private static int autoId = 0;

    public Follower(){
        autoId++;
        this.id = autoId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLikeNumb() {
        return likeNumb;
    }

    public void setLikeNumb(int likeNumb) {
        this.likeNumb = likeNumb;
    }

    @Override
    public String toString() {
        return "entity.Follower{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", likeNumb=" + likeNumb +
                '}';
    }
}
