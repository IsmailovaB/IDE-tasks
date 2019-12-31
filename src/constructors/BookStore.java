package constructors;

import codingBat.ArrayList;

import java.util.Scanner;

public class BookStore {
    public static void main(String[] args) {
        Book book = new Book("fsab");

//        Book book1 = new Book("Java", "cybertek", 200);
//        Book book2 = new Book("Automation", "cybertek", 100);
//        Book book3 = new Book("OCA", "java pr", 55);
//        Book[] myBooks = new Book[3];
//        myBooks[0] = book1;
//        myBooks[1] = book2;
//        myBooks[2] = book3;
//
////        myBooks[0].page=150;
//        for (Book eachBook : myBooks) {
//            System.out.println(eachBook.name);
//            eachBook.info();
////            eachBook = book1;
//        }
//        for (int i = 0, j = 50; i < myBooks.length; i++, j += 100) {
//            myBooks[i].page = j;
//        }
//        for (Book eachBook : myBooks) {
//            eachBook.info();
//        }

        Scanner scan = new Scanner(System.in);
        System.out.println("How many books do you have?");
        int bookSize = scan.nextInt();
        scan.nextLine();
        Book[] arr = new Book[bookSize];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Enter books title:"+(i+1));
//            String title = scan.nextLine();
//            System.out.println("Enter books author:"+(i+1));
//            String author = scan.nextLine();
//            System.out.println("Enter books page"+(i+1));
//            int page = scan.nextInt();
//            scan.nextLine();
////            Book scanBook = new Book(title,author,page);
////            arr[i] = scanBook;
//            arr[i] = new Book(title,author,page);
//        }
//        for(Book book: arr){
//            System.out.println(book.title);
//        }
        int num =0;
        do {
            System.out.println("Enter books title:");
            String name = scan.nextLine();
            System.out.println("Enter books author:");
            String author1 = scan.nextLine();
            System.out.println("Enter books page");
            int page1 = scan.nextInt();
            bookSize--;
            Book scanBook = new Book(name,author1,page1);
            num++;
             arr[num] = scanBook;

        }while (bookSize!=0);


    }
}
