package HomeWorke2_9;

import java.util.HashSet;
import java.util.Set;

import static HomeWorke2_9.Number.createSet;
//
//import static HomeWorke2_9.ListOfProducts.listOfProducts;
//import static HomeWorke2_9.ListOfProducts.removProduct;

public class Main {
    // public static void main(String[] args) throws ChekingProductExeption {
    public static void main(String[] args) throws CheckingForSpellingCorrectness, CheckingProductRepeatsExeption {
        Set<String> product = new HashSet<>();
        product.add("лук");

        product.add("свекла");
        product.add("томатная паста");
        product.add("лавровый лист");
        product.add("говядина");
        product.add("свинина");
        product.add("капута");
        product.add("сахар");
        product.add("соль");
        product.add("кортошка");
        product.add("грибы");
        product.add("горох");
        product.add("колбаса");
        product.add("оливки");
        product.add("лимон");
        product.add("соленые огурцы");
        product.add("соленые огурцы");

        System.out.println(product);

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
        Product luk = new Product("Лук", 33.5f, 1);
        Product svekla = new Product("Свекла", 30.5f, 2);
        Product lavroviiList = new Product("Лавровый лист", 93.0f, 1);
        Product kapusta = new Product("Капуста", 15.0f, 1);
        Product tomatnayaPasta = new Product("Томатная паста", 70.9f, 1);
        Product kartofel = new Product("Картофель", 25.0f, 10);
        Product chesnok = new Product("Чеснок", 15.0f, 1);
        Product goviadina = new Product("Говядина", 590.0f, 1);
        Product sol = new Product("Соль", 10.5f, 1);
        Product sahar = new Product("Сахар", 30.5f, 1);
        Product gribi = new Product("Грибы", 350.0f, 1);
        Product goroh = new Product("Горох", 40.0f, 1);

        // ListOfProducts listProduct1 = new ListOfProducts();
        Set<String> listProduct1 = new HashSet<>();
        listProduct1.add(String.valueOf(luk));
        listProduct1.add(String.valueOf(svekla));
        listProduct1.add(String.valueOf(lavroviiList));
        listProduct1.add(String.valueOf(kapusta));
        listProduct1.add(String.valueOf(tomatnayaPasta));
        listProduct1.add(String.valueOf(kartofel));
        listProduct1.add(String.valueOf(chesnok));
        listProduct1.add(String.valueOf(goviadina));
        listProduct1.add(String.valueOf(sol));
        listProduct1.add(String.valueOf(sahar));

        System.out.println("Лист продуктов 1: " + listProduct1);

        //ListOfProducts listProduct2 = new ListOfProducts();
        Set<String> listProduct2 = new HashSet<>();
        listProduct2.add(String.valueOf(luk));
        listProduct2.add(String.valueOf(kartofel));
        listProduct2.add(String.valueOf(goviadina));
        listProduct2.add(String.valueOf(sol));
        listProduct2.add(String.valueOf(goroh));

        System.out.println("Лист продуктов 2: " + listProduct2);

        // ListOfProducts listProduct3 = new ListOfProducts();
        Set<String> listProduct3 = new HashSet<>();
        listProduct3.add(String.valueOf(luk));
        listProduct3.add(String.valueOf(kartofel));
        listProduct3.add(String.valueOf(goviadina));
        listProduct3.add(String.valueOf(sol));
        listProduct3.add(String.valueOf(gribi));
        listProduct3.add(String.valueOf(chesnok));

        System.out.println("Лист продуктов 3: " + listProduct3);
        // listProduct3.printListOfProducts();


        Set<String> borsh = new HashSet<>();
        borsh.add(listProduct1.toString());
        System.out.println("Рецепт Борща " + borsh);
        Set<String> svekolnik = new HashSet<>();
        svekolnik.add(listProduct2.toString());
        System.out.println("Рецепт Свекольника " + svekolnik);
        Set<String> sup = new HashSet<>();
        sup.add(listProduct2.toString());
        System.out.println("Рецепт Супа " + sup);
        RecipeBook.printRecipesBook(borsh, sup, svekolnik);


        System.out.println(createSet());


    }
}
