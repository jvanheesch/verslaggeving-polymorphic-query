package com.github.jvanheesch;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerslagRepository extends JpaRepository<Verslag, Long> {
}
