import java.util.Arrays;
import java.util.Scanner;

//Bài 7: Nhập mảng a gồm N phần tử bao gồm các số nguyên dương.
// Kiểm tra xem a có phải là mảng đối xứng hay không (ví dụ: [15 2 1 2 15] là mảng đối xứng).
public class Ex7 {
    public static void main(String[] args) {
        int[] a = arr_input();
        if (is_arr_reversible(a)){
            System.out.println("This array is reversible");
            return;
        }
        System.out.println("This array isn't reversible");
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

    public static boolean is_arr_reversible(int[] arr){
        int[] checker = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            checker[i] = arr[arr.length-1-i];
        }
        return Arrays.equals(checker, arr);
    }
}
