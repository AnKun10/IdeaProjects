package logic_handle;

import entity.Product;
import entity.Saler;
import entity.SalerProduct;
import entity.SalerProductDetail;
import main.Main;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class SalerProductService implements Addable,Displayable{
    public static void addSalerProduct() {
        //addSaler
        int salerNumb;
        do {
            System.out.print("Enter number of salers' management table: ");
            salerNumb = new Scanner(System.in).nextInt();
            if (salerNumb > 0) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        Saler saler = null;
        for (int i = 0; i < salerNumb; i++) {
            int salerId;
            do {
                System.out.print("Enter saler " + (i + 1) + " id: ");
                salerId = new Scanner(System.in).nextInt();
                for (int j = 0; j < Main.salers.length; j++) {
                    if (Main.salers[j] != null && salerId == Main.salers[j].getId()) {
                        saler = Main.salers[j];
                        break;
                    }
                }
                if (saler != null) {
                    break;
                }
                System.out.println("Invalid input, please try again!");
            } while (true);
            //addProduct
            int productNumb;
            do {
                System.out.print("Enter number of type of products for saler " + saler.getName() + ": ");
                productNumb = new Scanner(System.in).nextInt();
                if (productNumb > 0 && productNumb <= 5) {
                    break;
                }
                System.out.println("Invalid input, please try again!");
            } while (true);
            Product product = null;
            SalerProductDetail[] salerProductDetails = new SalerProductDetail[productNumb];
            int count = 0;
            for (int j = 0; j < productNumb; j++) {
                do {
                    System.out.print("Enter product " + (j + 1) + " id: ");
                    int productId = new Scanner(System.in).nextInt();
                    for (int k = 0; k < Main.products.length; k++) {
                        if (Main.products[k] != null && productId == Main.products[k].getId()) {
                            product = Main.products[k];
                            break;
                        }
                    }
                    if (product != null) {
                        break;
                    }
                    System.out.println("Invalid input, please try again!");
                } while (true);
                int quantity;
                do {
                    System.out.print("Enter number of products for saler " + saler.getName() + ": ");
                    quantity = new Scanner(System.in).nextInt();
                    if (quantity > 0 && quantity <= product.getQuantity()) {
                        for (int k = 0; k < Main.products.length; k++) {
                            if (Main.products[k] != null && product.getId() == Main.products[k].getId()) {
                                Main.products[k].setQuantity(Main.products[k].getQuantity() - quantity);
                                break;
                            }
                        }
                        break;
                    }
                    System.out.println("Invalid input, please try again!");
                } while (true);
                salerProductDetails[count] = new SalerProductDetail(product, quantity);
                count++;
            }
            //addSalerProduct
            SalerProduct salerProducts = new SalerProduct(saler, salerProductDetails);
            saveSalerProduct(salerProducts);
        }
    }

    public static void displaySalerProduct() {
        for (int i = 0; i < Main.salerProducts.length; i++) {
            if (Main.salerProducts[i] != null) {
                System.out.println((i + 1) + ", " + Main.salerProducts[i]);
            }
        }
    }

    private static void saveSalerProduct(SalerProduct salerProduct) {
        boolean repeatSalerProduct = false;
        for (int i = 0; i < Main.salerProducts.length; i++) {
            if (Main.salerProducts[i] == null) {
                for (int j = 0; j < i; j++) {
                    if (salerProduct == Main.salerProducts[j]) {
                        repeatSalerProduct = true;
                        break;
                    }
                }
                if (!repeatSalerProduct) {
                    Main.salerProducts[i] = salerProduct;
                }
            }
        }
    }

    public static void sortByName() {
        for (int i = 0; i < Main.salerProducts.length - 1; i++) {
            if (Main.salerProducts[i] == null) {
                continue;
            }
            for (int j = i + 1; j < Main.salerProducts.length; j++) {
                if (Main.salerProducts[j] == null) {
                    continue;
                }
                if (Main.salerProducts[j].getSaler().getName().compareTo(Main.salerProducts[i].getSaler().getName()) > 0) {
                    SalerProduct temp = Main.salerProducts[i];
                    Main.salerProducts[i] = Main.salerProducts[j];
                    Main.salerProducts[j] = temp;
                }
            }
        }
        displaySalerProduct();
    }

    public static void sortByType() {
        for (int i = 0; i < Main.salerProducts.length - 1; i++) {
            if (Main.salerProducts[i] == null) {
                continue;
            }
            for (int j = i + 1; j < Main.salerProducts.length; j++) {
                if (Main.salerProducts[j] == null) {
                    continue;
                }
            }
        }
        displaySalerProduct();
    }


    public static void calSalary() {
        for (int i = 0; i < Main.salerProducts.length; i++) {
            if (Main.salerProducts[i] == null) {
                continue;
            }
            double salary = 0;
            SalerProductDetail[] salerProductDetails = Main.salerProducts[i].getSalerProductDetails();
            for (int j = 0; j < salerProductDetails.length; j++) {
                salary += salerProductDetails[j].getProduct().getPrice() * salerProductDetails[j].getQuantity();
            }
            System.out.println("The salary of the saler id "+Main.salerProducts[i].getSaler().getId()+" is: "+salary);
        }
    }
}
