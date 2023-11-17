package com.example.demo1.dto;

import lombok.Data;

@Data
public class CharacterDTO {

    private Long id;
    private int inspiration;
    private int proficiencyBonus;
    private int armorClass;
    private int initiative;
    private int speed;
    private int hitDice;
    private int deathSaves;
    private String personalityTraits;
    private String ideals;
    private String bonds;
    private String flaws;
    private MainInformationDTO mainInformation;
}
