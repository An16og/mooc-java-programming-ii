
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        ArrayList<Book> lib= new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
        
        System.out.println("Input the name of the book, empty stops: ");
            String name= scanner.nextLine();
        if(name.isEmpty()){break;}
        System.out.println("Input the age recommendation: ");
            int age= Integer.valueOf(scanner.nextLine());
        lib.add(new Book(name, age));
        }
        System.out.println(lib.size()+" books in total.");
        System.out.println("Books:");
        Comparator<Book> comparator = Comparator.comparing(Book::getAge).thenComparing(Book::getname);
        Collections.sort(lib, comparator);
        for(Book book:lib){
            System.out.println(book);
        }

        
    }
}
