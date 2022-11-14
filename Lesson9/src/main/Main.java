package main;

import entity.Product;
import entity.Saler;
import entity.SalerProduct;
import logic_handle.ProductService;
import logic_handle.SalerProductService;
import logic_handle.SalerService;

import java.util.Scanner;

public class Main {
    public static Saler[] salers = new Saler[9000];
    public static Product[] products = new Product[9000];
    public static SalerProduct[] salerProducts = new SalerProduct[9000];

    public static void main(String[] args) {
        runMenu();
    }

    private static void showMenu() {
        System.out.println("-------------------MENU------------------");
        System.out.println("1, Nhập danh sách mặt hàng mới. In ra danh sách các mặt hàng đã có.");
        System.out.println("2, Nhập danh sách nhân viên.  In ra danh sách nhân viên đã có.");
        System.out.println("3, Lập Bảng danh sách bán hàng cho từng nhân viên, và in danh sách ra màn hình");
        System.out.println("4, Sắp xếp danh sách Bảng danh sách bán hàng");
        System.out.println("5, Lập bảng kê doanh thu cho mỗi nhân viên.");
        System.out.println("6, Thoát");
        System.out.println("-----------------------------------------");
    }
    private static int functionChoice() {
        int functionChoice;
        do {
            System.out.print("Choose function: ");
            functionChoice = new Scanner(System.in).nextInt();
            if (functionChoice >= 1 && functionChoice <= 6) {
                break;
            }
            System.out.println("Invalid value, please try again!");
        } while (true);
        return functionChoice;
    }
    private static void functionChoiceLogic(int functionChoice) {
        switch (functionChoice) {
            case 1:
                ProductService.addProduct();
                ProductService.displayProduct();
                break;
            case 2:
                SalerService.addSaler();
                SalerService.displaySaler();
                break;
            case 3:
                SalerProductService.addSalerProduct();
                SalerProductService.displaySalerProduct();
                break;
            case 4:
                SalerProductService.sortByName();
                break;
            case 5:
                SalerProductService.calSalary();
                break;
            case 6:
                System.exit(0);
        }
    }
    private static void runMenu() {
        while (true){
            showMenu();
            int functionChoice = functionChoice();
            functionChoiceLogic(functionChoice);
        }
    }
}
