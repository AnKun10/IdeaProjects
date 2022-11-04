import java.util.Scanner;

//Bài 28: Thực hiện nhập vào ma trận vuông số nguyên a có n dòng và n cột (n>0).
// Tính tổng đường chéo chính của ma trận này.
public class Ex28 {
    public static void main(String[] args) {
        int[][] arr = arrInput();
        int sum = arrMainDiagonalSum(arr);
        System.out.println("The sum of all elements in the main diagonal of the matrix is "+sum);
    }

    public static int[][] arrInput(){
        System.out.print("Enter n = ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("=> The square matrix has the size of "+n+"x"+n);
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A["+i+"]["+j+"] = ");
                arr[i][j] = new Scanner(System.in).nextInt();
            }
        }
        return arr;
    }

    public static int arrMainDiagonalSum(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        return sum;
    }
}
