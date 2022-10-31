import java.util.Scanner;

//Bài 5: Nhập số liệu cho dãy số nguyên a[0], a[1],…, a[n-1].
// Tìm số lớn thứ hai và vị trí của nó trong dãy.
// Chú ý trường hợp cả dãy bằng nhau thì sẽ không có số lớn thứ 2.
public class Ex5 {
    public static void main(String[] args) {
        int[] arr = arr();
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

    public static int second_largest_elements(int[] arr){

    }
}
