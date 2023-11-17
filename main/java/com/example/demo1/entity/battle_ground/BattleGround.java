package com.example.demo1.entity.battle_ground;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table(name="battle_ground")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access= AccessLevel.PRIVATE)
@Builder
public class BattleGround {

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
    private int length;
    private int width;
    @OneToMany
    @JoinColumn(name = "battle_ground_id", referencedColumnName = "id")
    private List<Cell> cell;
    private Long roundAmount;
    private Long currentMover;


}
