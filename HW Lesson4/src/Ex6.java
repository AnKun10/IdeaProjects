import java.util.Arrays;
import java.util.Scanner;

//Bài 6: Nhập số liệu cho dãy số nguyên a[0], a[1],…, a[n-1] và 2 số nguyên b, c (b < c).
// Tính trung bình cộng các phần tử của dãy nằm trong đoạn [b, c].
public class Ex6 {
    public static void main(String[] args) {
        int[] arr = arr_input();
        int[] elements_in_interval = arr_elements_in_interval(arr);
        double mean = arr_cal_mean(elements_in_interval);
        System.out.println("\n=> The mean of that(those) element(s) is "+mean);
    }

    public static int[] arr_input() {
        System.out.print("Enter n = ");
        int n = new Scanner(System.in).nextInt();
        int[] arr =new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("arr["+i+"] = ");
            arr[i] = new Scanner(System.in).nextInt();
        }
        return arr;
    }

    public static int[] arr_elements_in_interval(int[] arr){
        System.out.print("Enter left boundary of the interval = ");
        int b = new Scanner(System.in).nextInt();
        System.out.print("Enter right boundary of the interval = ");
        int c = new Scanner(System.in).nextInt();
        int count = 0;
        for (int temp : arr) {
            if (temp >= b & temp <= c) {
                count++;
            }
        }
        int[] elements_in_interval = new int[count];
        int index = 0;
        for (int temp : arr) {
            if (temp >= b & temp <= c) {
                elements_in_interval[index] = temp;
                index++;
            }
        }
        System.out.printf("\nThe element(s) in the interval [%s,%s] is(are): %s",b,c,Arrays.toString(elements_in_interval));
        return elements_in_interval;
    }

    public static double arr_cal_mean(int[] arr){
        double sum = 0;
        for (int i : arr){
            sum += i;
        }
        return sum/arr.length;
    }
}
