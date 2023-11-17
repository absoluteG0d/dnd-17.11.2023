package com.example.demo1.entity.character.equipment;

import jakarta.persistence.*;
import lombok.*;

@Table(name="weapon")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access= AccessLevel.PRIVATE)
@Builder

public class Weapon {

    @SequenceGenerator(
            name = "weapon_sequence",
            sequenceName = "weapon_sequence",
            allocationSize = 1
    )
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "weapon_sequence"
    )
    private Long id;
    private String name;
    private int cost;
    private int damage;
    private int weight;
    private String properties;
    private String notes;

}
