package spesce.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import spesce.springframework.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {
}
