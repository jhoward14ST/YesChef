package yeschef.repository;

import yeschef.entity.ImperialUnit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface ImperialUnitRepository extends CrudRepository<ImperialUnit, Long> {
}
