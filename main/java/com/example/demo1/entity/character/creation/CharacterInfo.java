package com.example.demo1.entity.character.creation;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="character")
public class CharacterInfo {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "character_sequence"
    )
    @SequenceGenerator(
            name = "character_sequence",
            sequenceName = "character_sequence",
            allocationSize = 1
    )
    private Long id;

    @Column(name="inspiration")
    private Integer inspiration;
    @Column(name="proficiency_bonus")
    private Integer proficiencyBonus;
    @Column(name="armor_class")
    private Integer armorClass;
    @Column(name="initiative")
    private Integer initiative;
    @Column(name="speed")
    private Integer speed;
    @Column(name="hit_dice")
    private Integer hitDice;
    @Column(name="death_saves")
    private Integer deathSaves;
    @Column(name="personality_traits")
    private String personalityTraits;
    @Column(name="ideals")
    private String ideals;
    @Column(name="bonds")
    private String bonds;
    @Column(name="flaws")
    private String flaws;
    @Embedded
    private MainInformation mainInformation;



}
