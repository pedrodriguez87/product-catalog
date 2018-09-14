package tech.bts.productcatalog;

import com.google.gson.Gson;

import java.io.PrintWriter;
import java.util.*;

public class ProductCatalogRead {

    public static void main(String[] args) throws Exception {

        // CSV - comma separated values
        // a,a,a,a,a,a

        Product p1 = new Product("iPhone X", 1000, 50);
        Product p2 = new Product("Macbook Pro", 1500, 30);
        Product p3 = new Product("Mouse" , 30, 100);

        List<Product> products = new ArrayList<Product>();
        products.add(p1);
        products.add(p2);
        products.add(p3);

        writeJSON(products);


        System.out.println("File written");
    }

    public static void writeJSON(List<Product> products) throws Exception {

        Gson gson = new Gson();
        String json = gson.toJson(products); // serializing (object to String)

        System.out.println(json);

        PrintWriter writer = new PrintWriter("products.json");

        writer.println(json);

        writer.close();

    }

    public static void writeCSV(List<Product> products) throws Exception {

        PrintWriter writer = new PrintWriter("products.csv");

        // writing
        // Name,Price,Units
        // iPhone X,1000,50
        // Macbook Pro,1500,30

        writer.println("Name,Price,Units");

        for (int i = 0; i < products.size(); i++){
            Product product = products.get(i);
            writer.println(product.name + "," + product.price + "," + product.unitsInStock);

        }


        writer.close();
    }
}

