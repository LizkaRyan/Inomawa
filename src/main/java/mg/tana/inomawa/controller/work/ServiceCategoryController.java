package mg.tana.inomawa.controller.work;

import lombok.RequiredArgsConstructor;
import mg.tana.inomawa.dto.ResponseJson;
import mg.tana.inomawa.service.work.ServiceCategorieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/service/category")
public class ServiceCategoryController {

    private final ServiceCategorieService serviceCategorieService;

    @GetMapping
    public ResponseJson<?> findAll(){
        return new ResponseJson<>(200,"Requête réussie",serviceCategorieService.findAll());
    }
}
