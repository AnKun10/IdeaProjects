import java.util.ArrayList;
import java.util.Scanner;

public interface ListFunction<T> {
    T insert(Scanner scanner);
    void delete(T object, ArrayList<T> objects, Scanner scanner);
    void update(T object, ArrayList<T> objects, Scanner scanner);
}
