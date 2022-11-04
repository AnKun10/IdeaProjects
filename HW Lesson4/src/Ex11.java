import java.util.Arrays;
import java.util.Scanner;

//Bài 11: Viết chương trình nhập số liệu cho ma trận các số nguyên A cấp mxn trong đó m, n là các số tự nhiên.
//Sau đó tìm ma trận chuyển vị B = (bij) cấp n x m của A, với bij = aji
public class Ex11 {
    public static void main(String[] args) {
        int[][] arr = arr();
        int[][] arr_trans = arr_trans(arr);
    }

    public static int[][] arr() {
        System.out.print("Enter number of rows: ");
        int m = new Scanner(System.in).nextInt();
        System.out.print("Enter number of columns: ");
        int n = new Scanner(System.in).nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter A[" + i + "][" + j + "] = ");
                arr[i][j] = new Scanner(System.in).nextInt();
            }
        }
        return arr;
    }

    public static int[][] arr_trans(int[][] arr) {
        int[][] arr_trans = new int[arr[0].length][arr.length];
        System.out.println("The transposition B of the array is:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr_trans[j][i] = arr[i][j];
            }
        }
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println("B[" + i + "][" + j + "] = "+arr_trans[i][j]);
            }
        }
        System.out.println(Arrays.deepToString(arr_trans));
        return arr_trans;
    }
}
