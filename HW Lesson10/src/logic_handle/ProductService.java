package logic_handle;

import entity.Product;
import main.Main;

import java.util.Scanner;

public class ProductService implements Addable, Displayable, Findable, Removable {

    public static void add() {
        int numb;
        do {
            System.out.print("Enter number of new products: ");
            numb = new Scanner(System.in).nextInt();
            if (numb > 0) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        for (int i = 0; i < numb; i++) {
            Product product = new Product();
            product.inputInfo();
            Main.products.add(product);
        }
    }

    public static void display() {
        for (Product product : Main.products) {
            System.out.println(product);
        }
    }

    public static void findByName() {
        System.out.print("Enter name of the product: ");
        String name = new Scanner(System.in).next();
        boolean hasName = false;
        System.out.print("The valid product in the list: ");
        for (Product temp : Main.products) {
            if (name.equals(temp.getName())) {
                System.out.print(temp + "\t");
                hasName = true;
            }
        }
        if (!hasName) {
            System.out.print("none");
        }
        System.out.println();
    }

    public static void findById() {
        System.out.print("Enter id of the product: ");
        int id = new Scanner(System.in).nextInt();
        boolean hasId = false;
        System.out.print("The valid product in the list: ");
        for (Product temp : Main.products) {
            if (id == temp.getId()) {
                System.out.print(temp + "\t");
                hasId = true;
            }
        }
        if (!hasId) {
            System.out.print("none");
        }
        System.out.println();
    }

    public static void findByPrice() {
        System.out.println("### PRICE RANGE ###");
        System.out.println("1, price < 50,000");
        System.out.println("2, 50,000 <= price <= 100,000");
        System.out.println("3, price > 100,000");
        System.out.println("###################");
        int rangeChoice;
        do {
            System.out.println("Choose a range: ");
            rangeChoice = new Scanner(System.in).nextInt();
            if (rangeChoice >= 1 && rangeChoice <= 3) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        System.out.print("The valid product in the list: ");
        boolean hasPrice = false;
        for (Product temp : Main.products) {
            switch (rangeChoice) {
                case 1:
                    if (temp.getPrice() < 50000) {
                        System.out.print(temp + "\t");
                        hasPrice = true;
                    }
                    break;
                case 2:
                    if (temp.getPrice() >= 50000 && temp.getPrice() <= 100000) {
                        System.out.print(temp + "\t");
                        hasPrice = true;
                    }
                    break;
                case 3:
                    if (temp.getPrice() > 100000) {
                        System.out.print(temp + "\t");
                        hasPrice = true;
                    }
                    break;
            }
        }
        if (!hasPrice) {
            System.out.print("none");
        }
        System.out.println();
    }

    public static void findByQuantity() {
        int quantity;
        do {
            System.out.print("Enter the maximum quantity of the product: ");
            quantity = new Scanner(System.in).nextInt();
            if (quantity > 0) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        boolean hasQuantity = false;
        System.out.print("The valid product in the list: ");
        for (Product temp : Main.products) {
            if (temp.getQuantity() <= quantity) {
                System.out.print(temp + "\t");
                hasQuantity = true;
            }
        }
        if (!hasQuantity) {
            System.out.print("none");
        }
        System.out.println();
    }

    public static void remove() {
        System.out.println("### REMOVE FUNCTION ###");
        System.out.println("1, By Name");
        System.out.println("2, By Id");
        System.out.println("#######################");
        int removeChoice;
        do {
            System.out.print("Choose function: ");
            removeChoice = new Scanner(System.in).nextInt();
            if (removeChoice == 1 || removeChoice == 2) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        String name = "";
        int id = 0;
        switch (removeChoice) {
            case 1:
                System.out.print("Enter name of the product: ");
                name = new Scanner(System.in).next();
                break;
            case 2:
                do {
                    System.out.print("Enter id of the product: ");
                    id = new Scanner(System.in).nextInt();
                    if (id > 0) {
                        break;
                    }
                    System.out.println("Invalid input, please try again!");
                } while (true);
                break;
        }
        for (Product temp : Main.products) {
            if ((removeChoice == 1 && temp.getName().equals(name))||(removeChoice ==2 &&temp.getId()==id)) {
                Main.products.remove(temp);
            }
        }
        System.out.println("Remove process complete!");
    }
}
