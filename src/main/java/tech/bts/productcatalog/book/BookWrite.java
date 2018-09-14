package tech.bts.productcatalog.book;

import com.google.gson.Gson;

import java.io.PrintWriter;
import java.util.*;


public class BookWrite {

    public static void main(String[] args) throws Exception{

        Book numb1 = new Book("cien años de soledad", "Gabriel GarciaM",500);

        System.out.println(numb1);

    }

    public static void writeJSON(Book book) throws Exception {

        Gson gson = new Gson();
        String json = gson.toJson(book); // serializing (object to String)

        PrintWriter writer = new PrintWriter("book.json");
        writer.println(json);
        writer.close();
    }
}
