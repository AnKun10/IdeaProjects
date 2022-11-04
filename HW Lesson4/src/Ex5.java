import java.util.Arrays;
import java.util.Scanner;

//Bài 5: Nhập số liệu cho dãy số nguyên a[0], a[1],…, a[n-1].
// Tìm số lớn thứ hai và vị trí của nó trong dãy.
// Chú ý trường hợp cả dãy bằng nhau thì sẽ không có số lớn thứ 2.
public class Ex5 {
    public static void main(String[] args) {
        int[] arr = arr_input();
        System.out.println(second_largest_elements(arr));
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

    public static String second_largest_elements(int[] arr) {
        int max = 0;
        String second_largest_elements = "The array doesn't have 2nd largest number";
        for (int i = 1; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] > arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
                if (i == 1) {
                    max = arr[j - 1];
                }
                if (i != 1 & max != arr[j - 1]) {
                    second_largest_elements = "The 2nd largest number of the array is " + arr[j - 1];
                    break;
                }
            }
        }
        return second_largest_elements;
    }
}
