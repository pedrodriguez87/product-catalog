package tech.bts.productcatalog;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.*;

public class ProductCatalogWrite {



    public static void main(String[] args) throws Exception {



        BufferedReader reader = new BufferedReader( new FileReader("products.json"));

        String json = reader.readLine();

        System.out.println(json);

        Gson gson = new Gson();


        Type type = new TypeToken<List<Product>>(){}.getType();


        List<Product> products = gson.fromJson(json, type);

        // 3 loops distintos para hacer lo mismo

        for (Product p : products) {
            System.out.println(p);
        }

        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.println(product);
        }

        int i = 0;
        while (i < products.size()) {
            Product p = products.get(i);
            System.out.println(p);
            i++;
        }


    }
}
