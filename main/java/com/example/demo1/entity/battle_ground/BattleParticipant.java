package com.example.demo1.entity.battle_ground;

import com.example.demo1.entity.character.creation.CharacterSheet;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name="battle_participant")
@Entity
@Getter
@Setter
public class BattleParticipant {
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
    @Embedded
    private CharacterSheet characterSheet;
    @Column(name = "initiative_roll")
    private int initiativeRoll;

}
