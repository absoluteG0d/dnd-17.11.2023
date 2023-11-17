package com.example.demo1.entity.character.creation;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access=AccessLevel.PRIVATE)
@Builder
@Embeddable
@Table(name="saving_throws")
public class SavingThrows {
    @Column(name="strength")
    private int strength;
    @Column(name="dexterity")
    private int dexterity;
    @Column(name="endurance")
    private int endurance;
    @Column(name="intelligence")
    private int intelligence;
    @Column(name="wisdom")
    private int wisdom;
    @Column(name="charisma")
    private int charisma;

}
