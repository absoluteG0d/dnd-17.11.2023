package com.example.demo1.dto;

import com.example.demo1.entity.character.race.RacialTrait;
import lombok.Data;

@Data
public class RaceDTO {
    private Long id;
    RacialTrait racialTrait;
}
