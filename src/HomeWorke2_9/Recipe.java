package HomeWorke2_9;

import java.util.*;


public class Recipe {

private final Map<Product,Integer> products=new HashMap<>();
    //private final Set<Product> products = new HashSet<>();
    private float costOfAllProducts;
    private final String recipeName;


    public Recipe(String recipeName) {
        this.recipeName = recipeName;
        this.costOfAllProducts = 0;

    }


//    public void addProductInRecipe(Product newProductsInRecipe) throws CheckingProductRepeatsExeption {
//        if (!products.add(newProductsInRecipe)) {
//            throw new CheckingProductRepeatsExeption("Такой продукт уже есть в рецепте.");
//        }
//
//    }
//
//Задание 2
//Возвращаемся к заданию со списком продуктов и рецептов. Вам необходимо доработать класс рецептов так, чтобы для каждого продукта мы могли записать необходимое количество (например, бананы — 2 штуки).
//
//Замените HashSet на HashMap, где в качестве ключа — продукт, а в качестве значения — необходимое количество. Если количество продукта не было передано, сохраните 1.
//
//Доработайте подсчет суммарной стоимости рецепта — умножьте стоимость каждого продукта на его количество.
    public void addProductInRecipe(Product product, int quantity) throws CheckingProductRepeatsExeption {
        if (products.containsKey(product)) {
            throw new CheckingProductRepeatsExeption("Что-то пошло не так,проверь. ");

        } else {
            products.put(product, quantity);
        }
    }
public int sumCostOfAllProducts(){
        int sum=0;
        for (Product key: products.keySet()){
            sum+=products.get(key)* key.getPrice();
        }return sum;
}

    public static Set<Product> getProducts() {
        return getProducts();
    }


    public float getCostOfAllProducts() {
        return costOfAllProducts;
    }

    public String getRecipeName() {
        return recipeName;
    }

    @Override
    public String toString() {
        return "Recipes{" +
                "products=" + products +
                ", costOfAllProducts=" + costOfAllProducts +
                ", recipeName='" + recipeName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipes = (Recipe) o;
        return Float.compare(recipes.costOfAllProducts, costOfAllProducts) == 0
                && products.equals(recipes.products)
                && recipeName.equals(recipes.recipeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products, costOfAllProducts, recipeName);
    }
}

//Вам необходимо усложнить задание со списком продуктов из прошлого урока.
// Создайте класс рецептов, который содержит поля:
//
// Множество продуктов.
// Суммарная стоимость всех продуктов у данного рецепта.
// Название рецепта.
//Создайте множество, в котором будут храниться все рецепты. Добавьте в него несколько рецептов.
//
//Рецепты не могут иметь одинаковое название — при попытке добавить рецепт с уже занятыми названием
// необходимо выбросить исключение. Рецепты с разным названием, содержащие одинаковый список продуктов,
// считаются разными рецептами.