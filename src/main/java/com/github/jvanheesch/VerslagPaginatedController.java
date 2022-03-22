package com.github.jvanheesch;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerslagPaginatedController {
    private final VerslagRepository verslagRepository;

    public VerslagPaginatedController(VerslagRepository verslagRepository) {
        this.verslagRepository = verslagRepository;
    }

    @GetMapping(path = "/verslagen_paginated")
    public Page<Verslag> get(Pageable pageable) {
        return verslagRepository.findAll(pageable);
    }
}
