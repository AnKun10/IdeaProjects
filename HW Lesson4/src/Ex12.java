import java.util.Arrays;
import java.util.Scanner;

//Bài 12: Viết chương trình tính tích 2 ma trận các số nguyên A cấp mxn và B cấp n x k
public class Ex12 {
    public static void main(String[] args) {
        int[][] arrA = arr1();
        int[][] arrB = arr2(arrA);
        int[][] product = MatrixProduct(arrA, arrB);
    }
    public static int[][] arr1() {
        System.out.print("Enter the numbers of rows of matrix A: ");
        int m = new Scanner(System.in).nextInt();
        System.out.print("Enter the numbers of columns of matrix A: ");
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
    public static int[][] arr2(int[][] arr1) {
        System.out.print("=> The numbers of rows of matrix B: "+arr1.length);
        int m = arr1.length;
        System.out.print("Enter the numbers of columns of matrix B: ");
        int n = new Scanner(System.in).nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter B[" + i + "][" + j + "] = ");
                arr[i][j] = new Scanner(System.in).nextInt();
            }
        }
        return arr;
    }
    
    public static int[][] MatrixProduct(int[][] arr1, int[][] arr2){
        int[][] MatrixProduct = new int[arr1.length][arr2[0].length];
        for (int i = 0; i < MatrixProduct.length; i++) {
            for (int j = 0; j < MatrixProduct[0].length; j++) {
                for (int k = 0; k < arr1[0].length; k++) {
                    MatrixProduct[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }
        for (int i = 0; i < MatrixProduct.length; i++) {
            for (int j = 0; j < MatrixProduct[0].length; j++) {
                System.out.println("P[" + i + "][" + j + "] = "+MatrixProduct[i][j]);
            }
        }
        System.out.println("AxB = "+ Arrays.deepToString(MatrixProduct));
        return MatrixProduct;
    }
}
