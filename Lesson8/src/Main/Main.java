package Main;

import entity.PaperManagement;
import logic_handle.PaperService;
import logic_handle.ReporterService;

import java.util.Scanner;

public class Main {
    public static PaperManagement[] paperManagements;
    public static void main(String[] args) {
        runMenu();
    }

    private static void runMenu() {
        while (true){
            displayMenu();
            executeFunction();
        }
    }

    private static void displayMenu(){
        System.out.println("---------------------MENU--------------------");
        System.out.println("1, Nhập danh sách phóng viên. In ra danh sách phóng viên đã có");
        System.out.println("2, Nhập danh sách kiểu bài viết. In ra danh sách kiểu bài đã có");
        System.out.println("3, Lập Bảng tính công cho phóng viên bằng cách nhập các kiểu bài mà mỗi phóng viên đã viết cùng số lượng tương ứng và in danh sách ra màn hình.");
        System.out.println("4, Sắp xếp danh sách Bảng tính công theo Họ tên phóng viên");
        System.out.println("5, Sắp xếp danh sách Bảng tính công theo Số lượng bài viết (giảm dần)");
        System.out.println("6, Lập bảng kê thu nhập của mỗi phóng viên");
        System.out.println("7, Thoát");
        System.out.println("---------------------------------------------");
    }

    private static void executeFunction(){
        int functionChoice;
        do {
            System.out.print("Choose function: ");
            functionChoice = new Scanner(System.in).nextInt();
            if (functionChoice >= 1 && functionChoice <= 7) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        switch (functionChoice) {
            case 1:
                ReporterService.addReporter();
                ReporterService.displayReporter();
                break;
            case 2:
                PaperService.addPaper();
                PaperService.displayPaper();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                System.exit(0);
        }
    }

}
