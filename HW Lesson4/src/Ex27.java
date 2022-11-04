import java.util.Arrays;
import java.util.Scanner;

//Bài 27: Thực hiện nhập vào hai mảng số nguyên a, b đều có n phần tử (n>0).
// Thực hiện tính tổng hai mảng này theo quy tắc:
// phần tử đầu của a sẽ được cộng với phần tử cuối của b để cho ra phần tử đầu của mảng kết quả,
// tiếp theo phần tử thứ 2 của a và phần tử gần cuối của b được cộng vào để cho ra phần tử thứ 2 của mảng kết quả, …
public class Ex27 {
    public static void main(String[] args) {
        System.out.println("Enter array A:");
        int[] arrA = arrInput();
        System.out.println("=> Array B also has " + arrA.length + " elements");
        System.out.println("Enter array B:");
        int[] arrB = new int[arrA.length];
        arrInputElements(arrB);
        int[] arrCal = arrCal(arrA,arrB);
        System.out.println("The new array is "+ Arrays.toString(arrCal));
    }

    public static int[] arrInput() {
        System.out.print("Enter n = ");
        int n = new Scanner(System.in).nextInt();
        int[] arr = new int[n];
        arrInputElements(arr);
        return arr;
    }

    public static void arrInputElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = new Scanner(System.in).nextInt();
        }
    }

    public static int[] arrCal(int[] arr1,int[] arr2){
        int[] arrCal = new int[arr1.length];
        for (int i = 0; i < arrCal.length; i++) {
            arrCal[i] = arr1[i] + arr2[arr2.length-1-i];
        }
        return arrCal;
    }
}
