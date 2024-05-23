package yeschef.service;

import yeschef.entity.ImperialUnit;
import yeschef.repository.ImperialUnitRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ImperialUnitService {

    /**
     * "A service class is typically used to handle business logic and complex
     * calculations.
     * It acts as a layer between the controller and the repository.
     * The controller handles HTTP requests and responses, while the repository
     * interacts with the database.
     * The service class can take some load off the controller and repository by
     * handling complex operations."
     */

    @Autowired
    ImperialUnitRepository repository;

    public List<ImperialUnit> get() {
        Iterable<ImperialUnit> imperialUnits = this.repository.findAll();
        List<ImperialUnit> list = new ArrayList<>();
        imperialUnits.forEach(list::add);
        return list;
    }
    
    public ImperialUnit get(Long id) {
        Optional<ImperialUnit> imperialUnitOptional = this.repository.findById(id);
        if (imperialUnitOptional.isEmpty()) {
            throw new RuntimeException();
        }
        return imperialUnitOptional.get();
    }
}
