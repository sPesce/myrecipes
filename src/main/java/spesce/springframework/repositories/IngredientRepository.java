package spesce.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import spesce.springframework.domain.Ingredient;

/**
 * -------------------------------------------------------------
 * Created By Steve P. on 1/27/2021
 * original package: spesce.springframework.repositories
 */
public interface IngredientRepository extends CrudRepository<Ingredient,Long> {
}
