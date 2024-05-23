package yeschef.repository;

import yeschef.entity.ImperialUnit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImperialUnitRepository extends JpaRepository<ImperialUnit, Long> {
}
