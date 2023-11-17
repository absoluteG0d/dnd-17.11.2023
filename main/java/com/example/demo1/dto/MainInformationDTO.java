package com.example.demo1.dto;

import lombok.Data;

@Data
public class MainInformationDTO {

    private String characterName;
    private String playerName;
    private int lvl;
    private ClazzDTO clazz;
    private RaceDTO race;
    private String background;
    private int experiencePoints;
}
