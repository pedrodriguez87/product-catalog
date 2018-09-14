package tech.bts.productcatalog;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.lang.reflect.Type;
import java.util.*;

import java.util.Scanner;

public class ProductCatalog {

    public static void main(String[] args) throws Exception{

        Scanner input = new Scanner(System.in); // scanner can read from keyboard

        BufferedReader reader = new BufferedReader( new FileReader("products.json") );
        String json = reader.readLine();
        Gson gson = new Gson();
        Type type = new TypeToken<List<Product>>(){}.getType();
        List<Product> products = gson.fromJson(json, type);

        while (true) {

            System.out.print("What do you want to do? ");
            String line = input.nextLine();


            if (line.equals("exit")){
                writeJSON(products);
                break;

            }else if (line.equals("add")){

                System.out.print("Product name? ");
                String name = input.nextLine();

                System.out.print("Price? ");
                double price = Double.parseDouble(input.nextLine());

                System.out.print("Units? ");
                int units = Integer.parseInt(input.nextLine());

                Product libro = new Product(name, price, units);

                products.add(libro);

                System.out.println(libro);

            }else if (line.equals("list")){

                for (Product product : products){
                    System.out.println(product);
                }

            }

        }



    }
    public static void writeJSON(List<Product> products) throws Exception {

        Gson gson = new Gson();
        String json = gson.toJson(products); // serializing (object to String)

        PrintWriter writer = new PrintWriter("products.json");
        writer.println(json);
        writer.close();
    }
}
