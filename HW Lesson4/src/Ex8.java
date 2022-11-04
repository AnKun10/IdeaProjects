import java.util.Scanner;

//Bài 8: Nhập mảng a gồm N phần tử bao gồm các số nguyên dương.
// In phần tử có số lần xuất hiện nhiều nhất trong a.
public class Ex8 {
    public static void main(String[] args) {
        int[] arr = arr_input();
        quicksort(arr, 0, arr.length - 1);
        int MostAppearancesIndex = IndexMostAppearances_via_quicksort(arr);
        System.out.println("The index with the most appearances in the array is "+MostAppearancesIndex);
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

    public static int IndexMostAppearances_via_quicksort(int[] arr) {
        int LeftPointer = 0;
        int RightPointer = arr.length - 1;
        int count1 = 1;
        int count2 = 1;
        int MostAppearancesIndex = 0;
        while (LeftPointer < RightPointer){
            while (arr[LeftPointer] == arr[LeftPointer+1]){
                count1++;
                LeftPointer++;
            }
            while (arr[RightPointer] == arr[RightPointer-1]){
                count2++;
                RightPointer--;
            }
            if (count1 > count2){
                MostAppearancesIndex = arr[LeftPointer];
                RightPointer--;
                count2 = 1;
            }
            else{
                MostAppearancesIndex = arr[RightPointer];
                LeftPointer++;
                count1 = 1;
            }
        }
        return MostAppearancesIndex;
    }

    public static void quicksort(int[] arr, int LowIndex, int HighIndex) {
        int pivot = arr[HighIndex];
        int RightPointer = HighIndex;
        int LeftPointer = LowIndex;
        if (LeftPointer >= RightPointer) {
            return;
        }
        while (LeftPointer < RightPointer) {
            while (LeftPointer <= pivot && LeftPointer < RightPointer) {
                LeftPointer++;
            }
            while (RightPointer >= pivot && LeftPointer < RightPointer) {
                RightPointer--;
            }
            swap(arr, LeftPointer, RightPointer);
        }
        swap(arr, LeftPointer, HighIndex);
        quicksort(arr, 0, LeftPointer - 1);
        quicksort(arr, LeftPointer + 1, HighIndex);
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
