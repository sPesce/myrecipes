package spesce.springframework.services;

import spesce.springframework.domain.Recipe;

import java.util.Set;

/**
 * -------------------------------------------------------------
 * Created By Steve P. on 1/27/2021
 * original package: spesce.springframework.services
 */
public interface RecipeService {
    Set<Recipe> getRecipes();
}
