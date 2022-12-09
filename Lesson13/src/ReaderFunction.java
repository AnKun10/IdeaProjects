import java.util.ArrayList;
import java.util.Scanner;

public class ReaderFunction implements ListFunction<Reader>{
    @Override
    public Reader insert(Scanner scanner) {
        int id = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();
        String birthday = scanner.nextLine();
        return new Reader(id,name,birthday);
    }

    @Override
    public void delete(Reader object, ArrayList<Reader> objects, Scanner scanner) {
        int id = Integer.parseInt(scanner.nextLine());
        for (Reader reader : objects) {
            if (reader.getId() == id){
                objects.remove(object);
            }
        }
    }

    @Override
    public void update(Reader object, ArrayList<Reader> objects, Scanner scanner) {
        int id = Integer.parseInt(scanner.nextLine());
        for (Reader reader : objects) {
            if (reader.getId() == id){
                reader.setName(scanner.nextLine());
                reader.setBirthday(scanner.nextLine());
            }
        }
    }
}
