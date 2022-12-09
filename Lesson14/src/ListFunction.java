import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public interface ListFunction<T>{
    T input(Scanner scanner);
    void findById(Map<Integer, T> hashMap, Scanner scanner);
    void updateById(Map<Integer, T> hashMap, Scanner scanner);
}
