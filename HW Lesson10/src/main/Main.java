package main;

import entity.Product;
import logic_handle.ProductService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Product> products = new ArrayList<>();

    public static void main(String[] args) {
        runMenu();
    }

    private static void runMenu() {
        while (true) {
            displayMenu();
            logicFunctionChoice();
        }
    }

    private static void displayMenu() {
        System.out.println("----------------MENU---------------");
        System.out.println("1, Thêm sản phẩm");
        System.out.println("2, Xóa sản phẩm");
        System.out.println("3, Xem danh sách sản phẩm");
        System.out.println("4, Tìm sản phẩm theo tên");
        System.out.println("5, Tìm sản phẩm theo id");
        System.out.println("6, Tìm các sản phẩn có số lượng dưới x");
        System.out.println("7, Tìm sản phẩm theo mức giá");
        System.out.println("8, Thoát");
        System.out.println("-----------------------------------");
    }

    private static void logicFunctionChoice() {
        int functionChoice;
        do {
            System.out.print("Choose function: ");
            functionChoice = new Scanner(System.in).nextInt();
            if (functionChoice >= 2 && functionChoice <= 8 && products.size() == 0) {
                System.out.println("There aren't any product in the data, please create new products! (function 1)");
            }
            if (functionChoice >= 1 && functionChoice <= 8) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        switch (functionChoice) {
            case 1:
                ProductService.add();
                break;
            case 2:
                ProductService.remove();
                break;
            case 3:
                ProductService.display();
                break;
            case 4:
                ProductService.findByName();
                break;
            case 5:
                ProductService.findById();
                break;
            case 6:
                ProductService.findByQuantity();
                break;
            case 7:
                ProductService.findByPrice();
                break;
            case 8:
                System.exit(0);
        }
    }
}
