package spesce.springframework.services;

import org.springframework.stereotype.Service;
import spesce.springframework.domain.Recipe;
import spesce.springframework.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Set;

/**
 * -------------------------------------------------------------
 * Created By Steve P. on 1/27/2021
 * original package: spesce.springframework.services
 */
@Service
public class RecipeServiceImpl implements RecipeService{

    RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipes = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipes::add);
        return recipes;
    }
}
