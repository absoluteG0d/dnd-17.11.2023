package com.example.demo1.entity.character.equipment;

import jakarta.persistence.*;
import lombok.*;

import java.util.concurrent.TimeUnit;

@Table(name="spell")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access= AccessLevel.PRIVATE)
@Builder

public class Spell {

    @SequenceGenerator(
            name = "spell_sequence",
            sequenceName = "spell_sequence",
            allocationSize = 1
    )
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "spell_sequence"
    )
    private Long id;

    private int level;
    @Enumerated(EnumType.ORDINAL)
    private TimeUnit castingTimeUnit;
    private int castingTime;
    private int range;
    private int area;
    private String components;
    @Enumerated(EnumType.ORDINAL)
    private TimeUnit durationTimeUnit;
    private int duration;
    private String school;
    private String attack;
    private String save;
    private String damage;
    private String effect;
    private String description;


}
