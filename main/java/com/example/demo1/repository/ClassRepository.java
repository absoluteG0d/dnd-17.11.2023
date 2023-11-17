package com.example.demo1.repository;

import com.example.demo1.entity.character.clazz.Clazz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<Clazz, Long> {
    boolean existsByName(String name);

}
