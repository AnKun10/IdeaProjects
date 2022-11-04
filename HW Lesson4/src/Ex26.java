import java.util.Scanner;

//Bài 26: Thực hiện nhập vào một mảng số nguyên a có n phần tử (n > 0) và một số nguyên x.
// Đếm số lần xuất hiện của x trong mảng a.
public class Ex26 {
    public static void main(String[] args) {
        int[] arr = arr_input();
        arrElementAppearances(arr);
    }

    public static int[] arr_input() {
        System.out.print("Enter n = ");
        int n = new Scanner(System.in).nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = new Scanner(System.in).nextInt();
        }
        return arr;
    }

    public static void arrElementAppearances(int[] arr){
        System.out.print("Enter x = ");
        int x = new Scanner(System.in).nextInt();
        int count = 0;
        for (int j : arr) {
            if (x == j) {
                count++;
            }
        }
        System.out.println(x+" appears "+count+" times in the array");
    }
}
