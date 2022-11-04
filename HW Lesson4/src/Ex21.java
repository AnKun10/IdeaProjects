import java.util.Scanner;

//Bài 21: Thực hiện nhập vào một ma trận số nguyên a có n dòng và m cột (n, m>0).
// Tính tổng, trung bình cộng của tất cả các giá trị trong ma trận.
public class Ex21 {
    public static void main(String[] args) {
        int[][] arr = arr();
        System.out.println("The sum of all elements in the array is "+sum(arr));
        System.out.println("The mean of all elements in the array is "+mean(arr,sum(arr)));
    }

    public static int[][] arr() {
        System.out.print("Enter number of rows: ");
        int n = new Scanner(System.in).nextInt();
        System.out.print("Enter number of columns: ");
        int m = new Scanner(System.in).nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter A[" + i + "][" + j + "] = ");
                arr[i][j] = new Scanner(System.in).nextInt();
            }
        }
        return arr;
    }

    public static double sum(int[][] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static double mean(int[][] arr, double sum){
        return sum/(arr.length*arr[0].length);
    }
}
