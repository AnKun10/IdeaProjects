import java.util.Arrays;
import java.util.Scanner;

//Bài 20: Thực hiện nhập vào một mảng số nguyên a có n phần tử (n>0) và một giá trị thực x.
// Thực hiện sắp xếp mảng a theo thứ tự tăng dần và chèn giá trị x vào trong mảng a sao cho vẫn giữ được tính sắp xếp của mảng.
public class Ex20 {
    public static void main(String[] args) {
        int[] arr = arr_input();
        quicksort(arr);
        System.out.println("The array (after sorting) is "+ Arrays.toString(arr));
        arr = AddElement(arr);
        quicksort(arr);
        System.out.println("The updated array (after sorting) is "+Arrays.toString(arr));
    }

    public static int[] AddElement(int[] arr){
        System.out.print("Enter element x = ");
        int x = new Scanner(System.in).nextInt();
        int[] arrUpdate = new int[arr.length+1];
        arrUpdate[arr.length] = x;
        for (int i = 0; i < arr.length; i++) {
            arrUpdate[i] = arr[i];
        }
        return arrUpdate;
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

    public static void quicksort(int[] arr) {
        quicksort(arr, 0, arr.length - 1);
    }

    public static void quicksort(int[] arr, int LowIndex, int HighIndex) {
        int pivot = arr[HighIndex];
        int RightPointer = HighIndex;
        int LeftPointer = LowIndex;
        if (LeftPointer >= RightPointer){
            return;
        }
        while (LeftPointer < RightPointer) {
            while (arr[LeftPointer] <= pivot && LeftPointer < RightPointer) {
                LeftPointer++;
            }
            while (arr[RightPointer] >= pivot && LeftPointer < RightPointer) {
                RightPointer--;
            }
            swap(arr, LeftPointer, RightPointer);
        }
        swap(arr, LeftPointer, HighIndex);
        quicksort(arr, LowIndex, LeftPointer - 1);
        quicksort(arr, LeftPointer + 1, HighIndex);
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
