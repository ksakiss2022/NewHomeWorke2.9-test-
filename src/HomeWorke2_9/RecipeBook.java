package HomeWorke2_9;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RecipeBook {
    public static Set<Recipes> recipe = new HashSet<>();

    public static void addRecipes(Recipes recipes) {
        for (var BookRecipeCollection : recipe) {
            if (BookRecipeCollection.getRecipeName().equals(recipes.getRecipeName())) {
                throw new RuntimeException(" Рецепт есть. ");
            }

        }
        recipe.add(recipes);
    }

    public static void printRecipesBook() {
        System.out.println("Список рецептов : ");
        for (Recipes recipe : recipe) {
            System.out.println(recipe.getRecipeName() + "-");
//            for (Map.Entry<Products, Integer> entry : recipe.getProducts(),recipe.getCostOfAllProducts()){
//                System.out.println(entry.getKey() + "- " + entry.getValue() + "кг.");
//            }
            System.out.println("Сумма продуктов " + recipe.getCostOfAllProducts() + "руб.");

        }
    }
}
