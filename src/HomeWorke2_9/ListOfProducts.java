package HomeWorke2_9;

import java.util.HashSet;
import java.util.Set;

public class ListOfProducts  {
    public static Set<Products> listOfProducts=new HashSet<>();



    public static void printListOfProducts() {
        System.out.println("Список продуктов: ");
        for (Products products:listOfProducts){
            System.out.println(products.getProduct()+"-"+" за "+products.getPrice()+" руб."+products.getQuantity()+"кг./шт.");
        }
    }
    protected static void addListOfProducts(Products newProducts) throws CheckingProductRepeatsExeption {
        if (!listOfProducts.add(newProducts)){
            throw new CheckingProductRepeatsExeption("Такой продукт уже есть в списке.");
        }
    }

    public static boolean removProduct(String productToRemove){
        for (int i = 0; i < listOfProducts.size(); i++) {
            if (listOfProducts.equals(productToRemove)){
                listOfProducts.remove(i);
                System.out.println(productToRemove+"удален из списка!");
                return  true;
            }

        }
        System.out.println(productToRemove+"не найден в списке!");
        return false;
    }

    public static boolean chekList(String productToCheck){
        for (Products product :listOfProducts){
            if (product.getProduct().equals(productToCheck)){
                System.out.println(productToCheck+" продукт куплен.");
                return true;
            }
        }
        System.out.println(productToCheck+" продукт еще не куплен.");
        return false;
    }

}
