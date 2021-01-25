package spesce.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import spesce.springframework.domain.Category;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
