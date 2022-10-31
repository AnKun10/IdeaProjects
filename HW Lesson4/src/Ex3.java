import java.util.Arrays;
import java.util.Scanner;

//Bài 3: Nhập số n và dãy các số nguyên a[0], a[1],…, a[n-1] rồi sắp xếp dãy trên theo thứ tự tăng dần.
public class Ex3 {
    public static void main(String[] args) {
        int[] arr = arr();
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] arr() {
        System.out.print("Enter n = ");
        int n = new Scanner(System.in).nextInt();
        int[] arr =new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("arr["+i+"] = ");
            arr[i] = new Scanner(System.in).nextInt();
        }
        return arr;
    }

    public static void bubble_sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
