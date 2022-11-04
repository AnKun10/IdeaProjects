import java.util.Scanner;

//Bài 22: Thực hiện nhập vào một ma trận số nguyên a có n dòng và m cột (n, m>0).
// Tìm giá trị lớn nhất và nhỏ nhất của ma trận này.
public class Ex22 {
    public static void main(String[] args) {
        int[][] arr = arr();
        System.out.println("The largest number in the array is "+arrMax(arr));
        System.out.println("The smallest number in the array is "+arrMin(arr));
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

    public static int arrMax(int[][] arr){
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
    public static int arrMin(int[][] arr){
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (min > arr[i][j]){
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
}
