package tech.bts.productcatalog.book;

public class Book {

    String title;
    String author;
    double numPages;

    public Book(String title, String author, double numPages) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
    }

    public String toString() {
        return "The book name is: " + this.title + " , Written by :" +  this.author + " , And has : " +  this.numPages + " pages" ;
    }

}
