package tech.bts.productcatalog.book;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileReader;

import java.lang.reflect.Type;
import java.util.*;


public class BookRead {


    public static void main(String[] args) throws Exception {

        BufferedReader reader =
                new BufferedReader(new FileReader("book.json"));

        String json = reader.readLine();

        System.out.println(json);

        Gson gson = new Gson();

        Type type = new TypeToken<Book>() {}.getType();

        Book book = gson.fromJson(json, type);

        System.out.println(book);

    }


}
