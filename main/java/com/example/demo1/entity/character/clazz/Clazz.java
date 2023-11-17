package com.example.demo1.entity.character.clazz;

import jakarta.persistence.*;
import lombok.*;

@Table(name="clazz")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access= AccessLevel.PRIVATE)
@Builder
public class Clazz {
    @SequenceGenerator(
            name = "clazz_sequence",
            sequenceName = "clazz_sequence",
            allocationSize = 1
    )
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "clazz_sequence"
    )
    private Long id;
    @Column(name="hit_die")
    private int hitDie;
    @Column(name="primary_ability")
    @Enumerated(EnumType.STRING)
    private PrimaryAbility primaryAbility;
    @Column(name="saves")
    @Enumerated(EnumType.STRING)
    private Saves saves;
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String Description;

}
