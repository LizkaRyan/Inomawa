package mg.tana.inomawa.repository.work;

import mg.tana.inomawa.entity.work.ServiceCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceCategoryRepo extends JpaRepository<ServiceCategory,Long> {
}
