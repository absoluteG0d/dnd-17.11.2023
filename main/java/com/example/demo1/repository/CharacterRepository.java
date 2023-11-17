package com.example.demo1.repository;

import com.example.demo1.entity.character.creation.CharacterInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository  extends JpaRepository<CharacterInfo, Long> {
    Long countById(Long id);
}
