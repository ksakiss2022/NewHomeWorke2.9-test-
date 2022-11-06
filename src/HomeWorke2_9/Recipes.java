package HomeWorke2_9;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import static HomeWorke2_9.RecipeBook.recipe;

public class Recipes{


    private final Set<Products> products = new HashSet<>();
    private float costOfAllProducts;

    private final String recipeName;


    public Recipes(String recipeName) {
        this.recipeName = recipeName;
        this.costOfAllProducts=0;
        recipe.add(this);

    }
    public void addProductInRecipe(Products products)  {
        if (getProducts().add(products)){
            throw new RuntimeException("Такой продукт уже есть в списке.");
        }



        getProducts().add(products);
        costOfAllProducts=costOfAllProducts+products.getPrice()+products.quantity;
    }




    public Set<Products> getProducts() {
        return products;
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
        Recipes recipes = (Recipes) o;
        return Float.compare(recipes.costOfAllProducts, costOfAllProducts) == 0 && products.equals(recipes.products) && recipeName.equals(recipes.recipeName);
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