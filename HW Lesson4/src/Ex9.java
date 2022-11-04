import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

//Bài 9: Viết chương trình tạo ngẫu nhiên mảng a gồm N phần tử bao gồm các số nguyên.
// In ra các số khác nhau trong dãy.
public class Ex9 {
    public static void main(String[] args) {
        int[] rand_arr = rand_arr();
    }

    public static int[] rand_arr(){
        int rand=new Random().nextInt(10);
        System.out.println("The array has "+rand+" elements");
        int[] arr = new int[rand];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(10);
        }
        System.out.println("The array = "+ Arrays.toString(arr));
        return arr;
    }
}
