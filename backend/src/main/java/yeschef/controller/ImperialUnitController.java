package yeschef.controller;

import yeschef.entity.ImperialUnit;
import yeschef.model.ImperialUnitDTO;
import yeschef.service.ImperialUnitService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

import java.util.List;

@RestController
@RequestMapping("/api/imperialUnit")
public class ImperialUnitController {
    @Autowired
    ImperialUnitService service;

    @CrossOrigin
    @GetMapping
    public List<ImperialUnit> get() {
        return service.get();
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public ImperialUnit get(@PathVariable Long id) {
        return this.service.get(id);
    }
}
