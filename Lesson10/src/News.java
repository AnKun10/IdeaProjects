public class News implements Displayable{
    private String title;
    private String author;
    private String date;
    private double rate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", date='" + date + '\'' +
                ", rate=" + rate +
                '}';
    }

    @Override
    public void display() {
        System.out.print("title: "+this.title);
        System.out.print("author: "+this.author);
        System.out.print("date: "+this.date);
        System.out.print("rate: "+this.rate);
    }
}
