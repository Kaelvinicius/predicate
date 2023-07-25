package application;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 300.00));
        list.add(new Product("Fridge", 90.75));
        list.add(new Product("Sofa", 600.99));
        list.add(new Product("Computer", 75.80));

        //list.removeIf(new ProductPredicate());

        Double min = 100.00;

        // Lambda inline
        list.removeIf(p -> p.getPrice() >= min);

        for(Product p : list){
            System.out.println(p);
        }
    }
}
