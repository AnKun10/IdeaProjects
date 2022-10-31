import java.util.Scanner;

//Bài 4: Nhập số liệu cho dãy số nguyên a[0], a[1],…, a[n-1].
// Đếm xem có bao nhiêu cặp 2 phần tử liên tiếp bằng nhau trong dãy trên
// (tức là đếm số cặp a[i] , a[i+1] sao cho a[i] = a[i+1]; nếu có trường hợp a[i] = a[i+1] = a[i+2] thì được xem là có 2 cặp).
public class Ex4 {
    public static void main(String[] args) {
        int[] arr = arr();
        int count = compare(arr);
        System.out.println("There are "+count+" pairs of elements that satisfy the condition");
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

    public static int compare(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]==arr[i-1]){
                count++;
            }
        }
        return count;
    }
}
