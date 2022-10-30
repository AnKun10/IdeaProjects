import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        double sum = 0;
        System.out.println("The mean of the array = "+sum/a.length);
    }
    public static int[] EnterArray (){
        System.out.print("Enter n = ");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("a["+i+"] = ");
            a[i] = new Scanner(System.in).nextInt();
            sum += a[i];
        }
        return a;
    }

}
