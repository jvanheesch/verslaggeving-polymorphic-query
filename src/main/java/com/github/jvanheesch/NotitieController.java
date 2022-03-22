package com.github.jvanheesch;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NotitieController {
    private final NotitieRepository notitieRepository;

    public NotitieController(NotitieRepository notitieRepository) {
        this.notitieRepository = notitieRepository;
    }

    @GetMapping("/notities")
    public List<Notitie> getNotities() {
        return notitieRepository.findAll();
    }
}
