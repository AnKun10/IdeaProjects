import java.util.Scanner;

//Bài 5:
//a. Nhập vào một chuỗi bất kỳ và một ký tự nào đó. Tìm kiếm vị trí xuất hiện đầu tiên và cuối cùng của ký tự đó trong chuỗi vừa nhập.
//b. Nhập 3 xâu ký tự ký tự s, s1, s2. Tìm tất cả những lần xuất hiện của s1 trong s và thay thế bằng s2. Xuất s ra màn hình Ví dụ: s = “TIM KIEM VA THAY THE”, s1 = “TH”, s2 = “123”. Kết quả xâu ký tự s sẽ là: “TIM KIEM VA 123AY 123E”
public class Ex5 {
    public static void main(String[] args) {
        //Part a
        String text;
        char letter;

        Scanner input = new Scanner(System.in);
        System.out.print("Write something: ");
        text = input.nextLine();
        System.out.print("Letter you want to find in the text: ");
        letter = input.next().charAt(0);
        System.out.printf("The 1st appearance of the %s is at the index %s", letter, text.indexOf(letter));
        System.out.printf("\nThe 2nd appearance of the %s is at the index %s\n", letter, text.lastIndexOf(letter));

        //Part b
        String s, s1, s2;
        input.nextLine();
        System.out.print("\nWrite something: ");
        s = input.nextLine();
        System.out.print("Characters you want to replace in the text: ");
        s1 = input.nextLine();
        System.out.printf("Replace %s with Characters: ",s1);
        s2 = input.nextLine();
        System.out.print("\n=> The new text: "+s.replace(s1,s2));

    }
}
