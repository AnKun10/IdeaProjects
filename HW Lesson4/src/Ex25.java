import java.util.Scanner;

//Bài 25: Thực hiện nhập vào một mảng số nguyên a có n phần tử (n > 0).
// Đếm xem trong mảng có bao nhiêu số lẻ và bao nhiêu số chẵn.
public class Ex25 {
    public static void main(String[] args) {
        int[] arr = arr_input();
        System.out.println("There are "+arrEven(arr)+" even numbers in the array");
        System.out.println("There are "+arrOdd(arr)+" odd numbers in the array");
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

    public static int arrEven(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                count++;
            }
        }
        return count;
    }
    public static int arrOdd(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==1){
                count++;
            }
        }
        return count;
    }
}
