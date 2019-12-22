package constructors;

import codingBat.ArrayList;

public class Book {

    String title;
    String author;
    int page;
//    Author author = new Author();
//    int [] num;

    public Book(String title){
        this.title = title;
    }
    public Book(String title, String author){
        this(title);                //chaining constructor.(taking firtst cons-rs title)
        this.author = author;
    }
    public Book(String title, String author, int page){
        this(title,author);         //chaining constructor.(calling second cons.) All of them are pointing instance vars.
        this.page = page;
    }
    public void info(){
        System.out.println("Name of the book: "+this.title);
        System.out.println("Author of the book: "+this.author);
        System.out.println("Pages of the book: "+page);

    }
}
