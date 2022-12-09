import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Reader> readers = new ArrayList<>();
        BookFunction bookFunction = new BookFunction();
        ReaderFunction readerFunction = new ReaderFunction();
        Scanner scanner = new Scanner(System.in);
        Book book = bookFunction.insert(scanner);
        Reader reader = readerFunction.insert(scanner);
        books.add(book);
        readers.add(reader);
        bookFunction.update(book,books,scanner);
        readerFunction.update(reader,readers,scanner);
        bookFunction.delete(book,books,scanner);
        readerFunction.delete(reader,readers,scanner);
    }
}
