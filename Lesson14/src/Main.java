import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Student> map = new HashMap<>();
        StudentFunction studentFunction = new StudentFunction();
        Scanner scanner = new Scanner(System.in);
        while (true){
            Student student = studentFunction.input(scanner);
            map.put(student.getId(), student);
            studentFunction.findById(map, scanner);
            studentFunction.updateById(map, scanner);
        }
    }
}
