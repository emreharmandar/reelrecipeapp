package emre.harmandar.recipeapp.Listeners;

import emre.harmandar.recipeapp.Models.RecipeDetailsResponse;

public interface RecipeDetailsListener {
    void didFetch(RecipeDetailsResponse response, String message);
    void didError(String message);
}
