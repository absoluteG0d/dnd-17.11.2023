package com.example.demo1.entity.character.race;

import jakarta.persistence.*;
import lombok.*;

@Table(name="racial_trait")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RacialTrait {
    @SequenceGenerator(
            name = "race_sequence",
            sequenceName = "race_sequence",
            allocationSize = 1
    )
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "race_sequence"
    )
    private Long id;
    private String characteristic;
    private int points;
    private String name;
}
