package HomeWorke2_9;

 import java.util.HashSet;
 import java.util.Set;

 public class RecipeBook {
     public static Set<Recipe> recipesBook = new HashSet<>();

     protected void addRecipes(Recipe newRecipe) throws CheckingForDoublingOfTheRecipe {

             if (!recipesBook.contains(newRecipe)) {
                 recipesBook.add(newRecipe);}else {
                 throw new CheckingForDoublingOfTheRecipe(" Рецепт есть. ");
             }

         }



     public static void printRecipesBook(Set<String> borsh, Set<String> sup, Set<String> svekolnik) {
         System.out.println("Список рецептов : ");
         for (Recipe recipe : recipesBook) {
             System.out.println(recipe.getRecipeName() + "-");

            //  for (Map.Entry<Products, Integer> entry : entrySet()) {
            //      System.out.println(entry.getKey() + "- " + entry.getValue() + "кг.");
            //  }
            // System.out.println("Сумма продуктов " + recipe.getCostOfAllProducts() + "руб.");

         }
     }
 }

