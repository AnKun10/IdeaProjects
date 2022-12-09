import java.util.ArrayList;
import java.util.Scanner;

public class BookFunction implements ListFunction<Book>{
    @Override
    public Book insert(Scanner scanner) {
        int id = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();
        String author = scanner.nextLine();
        String publicDate = scanner.nextLine();
        return new Book(id,name,author,publicDate);
    }

    @Override
    public void delete(Book object, ArrayList<Book> objects, Scanner scanner) {
        int id = Integer.parseInt(scanner.nextLine());
        for (Book book : objects) {
            if (book.getId() == id){
                objects.remove(object);
            }
        }
    }

    @Override
    public void update(Book object, ArrayList<Book> objects, Scanner scanner) {
        int id = Integer.parseInt(scanner.nextLine());
        for (Book book : objects) {
            if (book.getId() == id){
                book.setName(scanner.nextLine());
                book.setAuthor(scanner.nextLine());
                book.setPublicDate(scanner.nextLine());
            }
        }
    }
}
