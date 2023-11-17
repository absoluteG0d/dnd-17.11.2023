package com.example.demo1.repository;

import com.example.demo1.entity.character.race.Race;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RaceRepository extends JpaRepository<Race, Long> {
    boolean existsByName(String name);
}
