public class Account implements Displayable{

    private String name;
    private int id;
    private int balance;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", balance=" + balance +
                '}';
    }



    @Override
    public void display() {
        System.out.print("name: "+this.name);
        System.out.print("id: "+this.id);
        System.out.print("balance: "+this.balance);
        System.out.print("email: "+this.email);
    }
}
