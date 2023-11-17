package com.example.demo1.entity.character.creation;


import com.example.demo1.entity.character.clazz.Clazz;
import com.example.demo1.entity.character.race.Race;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access=AccessLevel.PRIVATE)
@Builder
@Embeddable
public class MainInformation {
    @Column(name="character_name")
    private String characterName;
    @Column(name="player_name")
    private String playerName;
    @Column(name="lvl")
    private Integer lvl;
    @ManyToOne
    @JoinColumn(name="clazz_id", referencedColumnName = "id")
    private Clazz clazz;
    @ManyToOne
    @JoinColumn(name="race_id", referencedColumnName = "id")
    private Race race;
    @Column(name="background")
    private String background;
    @Column(name="experience_points")
    private Integer experiencePoints;


}
