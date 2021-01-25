package spesce.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import spesce.springframework.domain.Recipe;

/**
 * -------------------------------------------------------------
 * Created By Steve P. on 1/19/2021
 * original package: spesce.springframework.repositories
 */
public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
