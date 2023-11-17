package com.example.demo1.entity.character.creation;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access=AccessLevel.PRIVATE)
@Builder
@Embeddable
public class Skills {

    @Column(name="acrobatics")
    private int acrobatics;
    @Column(name="animalHanding")
    private int animalHanding;
    @Column(name="arcana")
    private int arcana;
    @Column(name="athletic")
    private int athletic;
    @Column(name="deceptions")
    private int deceptions;
    @Column(name="history")
    private int history;
    @Column(name="insight")
    private int insight;
    @Column(name="intimidation")
    private int intimidation;
    @Column(name="investigation")
    private int investigation;
    @Column(name="medicine")
    private int medicine;
    @Column(name="nature")
    private int nature;
    @Column(name = "perception")
    private int perception;
    @Column(name="performance")
    private int performance;
    @Column(name="persuasion")
    private int persuasion;
    @Column(name="religion")
    private int religion;
    @Column(name="sleight_of_hand")
    private int sleightOfHand;
    @Column(name="stealth")
    private int stealth;
    @Column(name="survival")
    private int survival;


}
