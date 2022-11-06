package HomeWorke2_9;

import HomeWorke2_7.Date;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static HomeWorke2_9.ListOfProducts.listOfProducts;

public class Main {
    public static void main(String[] args) throws CheckingProductRepeatsExeption, CheckingRecipes {
//        boolean valueOutput = Products.valiDateProduct("Морковь"
//        );
//        if (valueOutput) {
//            System.out.println("Значение задано верно.");
//        } else {
//            System.out.println("Значение задано не верно.");
//        }
        Set<String> set = new HashSet<>();
        set.add("Лук");
        set.add("Морковь");
        set.add("Картофель");
        set.add("Свекла");
        set.add("Томатная паста");
        set.add("Лук");
        set.add("Чеснок");
        set.add("Говядина");
        set.add("Капуста");
        set.add("Лавровый лист");
        //  System.out.println(Arrays.toString(set.toArray()));
        Products product1 = new Products("Лук", 33.5f, 1);
        Products product2 = new Products("Свекла", 30.5f, 2);
        Products product3 = new Products("Лавровый лист", 93.0f, 1);
        Products product4 = new Products("Капуста", 15.0f, 1);
        Products product5 = new Products("Томатная паста", 70.9f, 1);
        Products product6 = new Products("Картофель", 25.0f, 10);
        Products product7 = new Products("Чеснок", 15.0f, 1);
        Products product8 = new Products("Говядина", 590.0f, 1);
        Products product9 = new Products("Соль", 10.5f, 1);
        Products product10 = new Products("Сахар", 30.5f, 1);
        Products product11 = new Products("Лук", 32.5f, 1);

        ListOfProducts listOfProducts = new ListOfProducts();

        listOfProducts.addListOfProducts(product2);
        listOfProducts.addListOfProducts(product3);
        listOfProducts.addListOfProducts(product11);
        listOfProducts.addListOfProducts(product10);
        listOfProducts.addListOfProducts(product8);
        listOfProducts.addListOfProducts(product1);
        listOfProducts.addListOfProducts(product4);

        listOfProducts.printListOfProducts();


//    public static void calculate(Flower[] flowers) {
//        int lifeSpan = Integer.MAX_VALUE;
//        float sum = 0;
//        String text = "В букете есть:\n";
//        for (int i = 0; i < flowers.length; i++) {
//            if (flowers[i] != null) {
//                text += " " + flowers[i].getFlowerColorName() + " " + "из " + flowers[i].getCountry() + "\n";
//                if (flowers[i].getLifeSpan() < lifeSpan) {
//                    lifeSpan = flowers[i].getLifeSpan();
//                }
//                sum += flowers[i].getCost();
//            }
//            //     }
//            sum = sum * 1.10f;
//            text += "\n";
//            text += "Сумма букета = " + String.format("%.2f", sum);
//            text += "\n";
//            text += "Срок годности:" + lifeSpan;
//            System.out.println(text);
//
//        }


    }


}
