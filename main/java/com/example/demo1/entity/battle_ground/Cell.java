package com.example.demo1.entity.battle_ground;

import jakarta.persistence.*;
import lombok.*;

@Table(name="cell")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access= AccessLevel.PRIVATE)
@Builder
public class Cell {
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
    @Enumerated(EnumType.STRING)
    private Terrain terrain;
    @OneToOne
    @JoinColumn(name="battle_participant_id", referencedColumnName = "id")
    private BattleParticipant battleParticipant;


}
