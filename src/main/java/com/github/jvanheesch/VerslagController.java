package com.github.jvanheesch;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VerslagController {
    private final VerslagRepository verslagRepository;

    public VerslagController(VerslagRepository verslagRepository) {
        this.verslagRepository = verslagRepository;
    }

    @GetMapping("/verslagen")
    public List<Verslag> getVerslagen() {
        return verslagRepository.findAll();
    }
}
