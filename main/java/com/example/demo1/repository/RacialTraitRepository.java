package com.example.demo1.repository;

import com.example.demo1.entity.character.race.RacialTrait;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RacialTraitRepository  extends JpaRepository<RacialTrait, Long> {
    boolean existsByNameAndCharacteristicAndPoints(String name, String characteristic, int points);
}
