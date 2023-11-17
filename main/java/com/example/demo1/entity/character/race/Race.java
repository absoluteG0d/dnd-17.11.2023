package com.example.demo1.entity.character.race;


import jakarta.persistence.*;
import lombok.*;

@Table(name="Race")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access= AccessLevel.PRIVATE)
@Builder
public class Race {

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
    @Column(name="racial_trait")
    @Enumerated(EnumType.STRING)
    private RacialTrait racialTrait;
}
