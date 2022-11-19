package emre.harmandar.recipeapp.Listeners;

import emre.harmandar.recipeapp.Models.RandomRecipeApiResponse;

public interface RandomRecipeResponseListener {
    void didFetch(RandomRecipeApiResponse response, String message);
    void didError(String message);
}
