package yeschef.service;

import yeschef.entity.ImperialUnit;
import yeschef.repository.ImperialUnitRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Service;

@Service
public class ImperialUnitService {
    @Autowired
    ImperialUnitRepository imperialUnitRepository;

    private final RestTemplate RestTemplate;

    public ImperialUnitService(RestTemplateBuilder restTemplateBuilder) {
        this.RestTemplate = restTemplateBuilder.build();
    }

    public List<ImperialUnit> get() {
        return imperialUnitRepository.findAll();
    }

    public ImperialUnit get(Long id) {
        Optional<ImperialUnit> imperialUnitOptional = this.imperialUnitRepository.findById(id);
        if (imperialUnitOptional.isEmpty()) {
            throw new RuntimeException();
        }
        return imperialUnitOptional.get();
    }
}
