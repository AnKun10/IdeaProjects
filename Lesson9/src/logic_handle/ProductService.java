package logic_handle;

import entity.Product;
import main.Main;

import java.util.Scanner;

public class ProductService implements Addable,Displayable{
    public static void addProduct() {
        int numb;
        do {
            System.out.print("Enter number of new products: ");
            numb = new Scanner(System.in).nextInt();
            if (numb >= 1) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        for (int i = 0; i < numb; i++) {
            Product product = new Product();
            product.infoInput();
            for (int j = 0; j < Main.products.length; j++) {
                if (Main.products[j] == null) {
                    Main.products[j] = product;
                    break;
                }
            }
        }
    }

    public static void displayProduct() {
        for (int i = 0; i < Main.products.length; i++) {
            if (Main.products[i] != null) {
                System.out.println((i + 1) + ", " + Main.products[i]);
            }
        }
    }
}
