import java.util.Arrays;
import java.util.Scanner;

//Bài 23: Thực hiện nhập vào hai ma trận số nguyên a, b có n dòng và m cột (n, m>0).
// Thực hiện tính tổng hai ma trận này.
public class Ex23 {
    public static void main(String[] args) {
        int[][] arrA = arr();
        System.out.println("=> The matrix B also has a "+arrA.length+"x"+arrA[0].length+" size");
        int[][] arrB = new int[arrA.length][arrA[0].length];
        arrElements(arrB);
        int[][] sum = arrSum(arrA,arrB);
        System.out.println("The sum of matrix A & matrix B is "+ Arrays.deepToString(sum));
    }

    public static int[][] arr() {
        System.out.print("Enter number of rows: ");
        int n = new Scanner(System.in).nextInt();
        System.out.print("Enter number of columns: ");
        int m = new Scanner(System.in).nextInt();
        int[][] arr = new int[n][m];
        arrElements(arr);
        return arr;
    }

    public static void arrElements(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("Enter A[" + i + "][" + j + "] = ");
                arr[i][j] = new Scanner(System.in).nextInt();
            }
        }
    }

    public static int[][] arrSum(int[][] arr1,int[][] arr2){
        int[][] sum = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[0].length; j++) {
                sum[i][j] = arr1[i][j]+arr2[i][j];
            }
        }
        return sum;
    }
}
