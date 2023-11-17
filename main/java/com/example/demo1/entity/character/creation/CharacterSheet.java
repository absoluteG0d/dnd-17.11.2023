package com.example.demo1.entity.character.creation;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access= AccessLevel.PRIVATE)
@Embeddable
public class CharacterSheet {
    @ManyToOne
    @JoinColumn(name="character_id", referencedColumnName = "id")
    private CharacterInfo characterInfo;
    @Embedded
    private HitPoints hitPoints;
    @Embedded
    private MainInformation mainInformation;
    @Embedded
    private SavingThrows savingThrows;
    @Embedded
    private Skills skills;

}
