package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BooksChange {
    public static void main(String[] args) {
        String [] books = {"Prison", "The God Father", "Lost", "OCA", "Escape"};
        Arrays.sort(books);
        System.out.println(Arrays.toString(books));
        Scanner scan = new Scanner(System.in);

        System.out.println("What book you want ");
        String userBook = scan.nextLine();

        System.out.println(Arrays.binarySearch(books,userBook));
        int index = Arrays.binarySearch(books,userBook);
        if(index>=0){
            System.out.println("What book you replace the original book with: ");
            String newBook = scan.nextLine();
            books[index]=newBook;

        }else{
            System.out.println("Book not found");
        }
        System.out.println(Arrays.toString(books));

    }
}
