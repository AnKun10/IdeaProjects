import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentFunction implements ListFunction<Student> {
    @Override
    public Student input(Scanner scanner) {
        System.out.print("Enter Student's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Student's score: ");
        double score = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter Student's age: ");
        int age = Integer.parseInt(scanner.nextLine());
        return new Student(name, score, age);
    }

    @Override
    public void findById(Map<Integer, Student> hashMap, Scanner scanner) {
        System.out.print("Enter Student's id: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Map.Entry<Integer, Student> entry : hashMap.entrySet()) {
            if (entry.getKey() == id){
                System.out.println("Search result: "+entry.getValue());
                return;
            }
        }
        System.out.println("Search result: none!");
    }

    @Override
    public void updateById(Map<Integer, Student> hashMap, Scanner scanner) {
        System.out.print("Enter Student's id: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Map.Entry<Integer, Student> entry : hashMap.entrySet()) {
            if (entry.getKey() == id){
                System.out.print("Enter Student's name: ");
                entry.getValue().setName(scanner.nextLine());
                System.out.print("Enter Student's score: ");
                entry.getValue().setScore(Double.parseDouble(scanner.nextLine()));
                System.out.print("Enter Student's age: ");
                entry.getValue().setAge(Integer.parseInt(scanner.nextLine()));
                return;
            }
        }
        System.out.println("Search result: none!");
    }
}
