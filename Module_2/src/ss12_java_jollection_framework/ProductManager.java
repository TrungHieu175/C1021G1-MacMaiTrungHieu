package ss12_java_jollection_framework;

import java.util.ArrayList;

public class ProductManager {
    public static ArrayList<Product> listProduct;
    public static void add(Product product) {
        listProduct.add(product);
    }
    public static void remove(int id) {
        listProduct.remove(new Product(id));
    }
//    public static void edit(int id, Product product){
//        listProduct.set(product);
//    }
    public static void main(String[] args) {
        listProduct = new ArrayList<Product>();
        Product p1 = new Product(1, "Laptop", 1000000);
        Product p2 = new Product(2, "PC", 1000000);

        add(p1);
        add(p2);
        remove(p1.getId());
        for(int i=0;i< listProduct.size();i++){
            System.out.println(listProduct.get(i).getName());
        }

    }
}
