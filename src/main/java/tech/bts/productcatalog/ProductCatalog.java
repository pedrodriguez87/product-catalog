package tech.bts.productcatalog;

import java.util.*;

import java.util.Scanner;

public class ProductCatalog {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // scanner can read from keyboard

        List<Product> products = new ArrayList<Product>(); //Creates an empty list

        while (true) {

            System.out.print("What do you want to do? ");
            String line = input.nextLine();


            if (line.equals("exit")){
                break;

            }

            if (line.equals("add")){

                System.out.print("Product name? ");
                String name = input.nextLine();

                System.out.print("Price? ");
                double price = Double.parseDouble(input.nextLine());

                System.out.print("Units? ");
                int units = Integer.parseInt(input.nextLine());

                Product libro = new Product(name, price, units);

                products.add(libro);

                System.out.println(libro);
            }

            if (line.equals("list")){

                for (Product product : products){
                    System.out.println(product);
                }

            }

        }
    }
}
