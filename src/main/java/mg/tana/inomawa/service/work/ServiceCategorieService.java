package mg.tana.inomawa.service.work;

import lombok.RequiredArgsConstructor;
import mg.tana.inomawa.entity.work.ServiceCategory;
import mg.tana.inomawa.repository.work.ServiceCategoryRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceCategorieService {

    private final ServiceCategoryRepo serviceCategoryRepo;

    public List<ServiceCategory> findAll(){
        return serviceCategoryRepo.findAll();
    }
}
