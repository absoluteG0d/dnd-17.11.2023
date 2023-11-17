package com.example.demo1.creator;

import com.example.demo1.entity.character.race.RacialTrait;
import com.example.demo1.repository.RacialTraitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RacialTraitCreator {
    private final RacialTraitRepository racialTraitRepository;

    public void create(){
        if(!racialTraitRepository.existsByNameAndCharacteristicAndPoints(null, "Strength", 2)){
            RacialTrait strengthTrait = new RacialTrait();
            strengthTrait.setPoints(2);
            strengthTrait.setCharacteristic("Strength");
        }

        if(!racialTraitRepository.existsByNameAndCharacteristicAndPoints(null, "Charisma", 1)){
            RacialTrait charismaTrait = new RacialTrait();
            charismaTrait.setPoints(1);
            charismaTrait.setCharacteristic("Charisma");
        }

        if(!racialTraitRepository.existsByNameAndCharacteristicAndPoints("Draconic Ancestry", null, 0)){
            RacialTrait draconicAncesrtyTrait = new RacialTrait();
            draconicAncesrtyTrait.setPoints(0);
            draconicAncesrtyTrait.setName("Draconic Ancestry");
        }

        if(!racialTraitRepository.existsByNameAndCharacteristicAndPoints("Breath Weapon", null, 0)){
            RacialTrait breathWeaponTrait = new RacialTrait();
            breathWeaponTrait.setPoints(0);
            breathWeaponTrait.setName("Breath Weapon");
        }

        if(!racialTraitRepository.existsByNameAndCharacteristicAndPoints("Damage Resistance", null, 0)){
            RacialTrait damageResistanceTrait = new RacialTrait();
            damageResistanceTrait.setPoints(0);
            damageResistanceTrait.setName("Damage Resistance");
        }

        if(!racialTraitRepository.existsByNameAndCharacteristicAndPoints(null, "Constitution", 2)){
            RacialTrait constitutionTrait = new RacialTrait();
            constitutionTrait.setPoints(0);
            constitutionTrait.setCharacteristic("Constitution");
        }

        if(!racialTraitRepository.existsByNameAndCharacteristicAndPoints("Darkvision", null, 0)){
            RacialTrait darkvisionTrait = new RacialTrait();
            darkvisionTrait.setPoints(0);
            darkvisionTrait.setName("Darkvision");
        }

        if(!racialTraitRepository.existsByNameAndCharacteristicAndPoints("Dwarven Resilience", null, 0)){
            RacialTrait dwarvenResilienceTrait = new RacialTrait();
            dwarvenResilienceTrait.setPoints(0);
            dwarvenResilienceTrait.setName("Dwarven Resilience");
        }

        if(!racialTraitRepository.existsByNameAndCharacteristicAndPoints("Dwarven Combat Training", null, 0)){
            RacialTrait dwarvenCombatTrainingTrait = new RacialTrait();
            dwarvenCombatTrainingTrait.setPoints(0);
            dwarvenCombatTrainingTrait.setName("Dwarven Combat Training");
        }

        if(!racialTraitRepository.existsByNameAndCharacteristicAndPoints("Stonecunning", null, 0)){
            RacialTrait stonecunningTrait = new RacialTrait();
            stonecunningTrait.setPoints(0);
            stonecunningTrait.setName("Stonecunning");
        }

        if(!racialTraitRepository.existsByNameAndCharacteristicAndPoints(null, "Dexterity", 2)){
            RacialTrait dexterityTrait = new RacialTrait();
            dexterityTrait.setPoints(2);
            dexterityTrait.setCharacteristic("Dexterity");
        }

        if(!racialTraitRepository.existsByNameAndCharacteristicAndPoints("Keen Senses", null, 0)){
            RacialTrait keenSensesTrait = new RacialTrait();
            keenSensesTrait.setPoints(0);
            keenSensesTrait.setName("Keen Senses");
        }

        if(!racialTraitRepository.existsByNameAndCharacteristicAndPoints("Fey Ancestry", null, 0)){
            RacialTrait feyAncestryTrait = new RacialTrait();
            feyAncestryTrait.setPoints(0);
            feyAncestryTrait.setName("Fey Ancestry");
        }

        if(!racialTraitRepository.existsByNameAndCharacteristicAndPoints("Trance", null, 0)){
            RacialTrait tranceTrait = new RacialTrait();
            tranceTrait.setPoints(0);
            tranceTrait.setName("Trance");
        }

        if(!racialTraitRepository.existsByNameAndCharacteristicAndPoints(null, "Intelligence", 2)){
            RacialTrait intelligenceTrait = new RacialTrait();
            intelligenceTrait.setPoints(2);
            intelligenceTrait.setCharacteristic("Intelligence");
        }

        if(!racialTraitRepository.existsByNameAndCharacteristicAndPoints("Gnome Cunning", null, 0)){
            RacialTrait gnomeCunningTrait = new RacialTrait();
            gnomeCunningTrait.setPoints(0);
            gnomeCunningTrait.setName("Gnome Cunning");
        }

        if(!racialTraitRepository.existsByNameAndCharacteristicAndPoints(null, "Charisma", 2)){
            RacialTrait charismaTrait = new RacialTrait();
            charismaTrait.setPoints(2);
            charismaTrait.setCharacteristic("Charisma");
        }

        if(!racialTraitRepository.existsByNameAndCharacteristicAndPoints(null, "to Two Other Ability Scores", 1)){
            RacialTrait toTwoOtherAbilityScoresTrait = new RacialTrait();
            toTwoOtherAbilityScoresTrait.setPoints(1);
            toTwoOtherAbilityScoresTrait.setCharacteristic("to Two Other Ability Scores");
        }

        if(!racialTraitRepository.existsByNameAndCharacteristicAndPoints("Skill Versatility", null, 0)){
            RacialTrait skillVersatilityTrait = new RacialTrait();
            skillVersatilityTrait.setPoints(0);
            skillVersatilityTrait.setName("Skill Versatility");
        }

        if(!racialTraitRepository.existsByNameAndCharacteristicAndPoints("Lucky", null, 0)){
            RacialTrait luckyTrait = new RacialTrait();
            luckyTrait.setPoints(0);
            luckyTrait.setName("Lucky");
        }

        if(!racialTraitRepository.existsByNameAndCharacteristicAndPoints("Brave", null, 0)){
            RacialTrait braveTrait = new RacialTrait();
            braveTrait.setPoints(0);
            braveTrait.setName("Brave");
        }

        if(!racialTraitRepository.existsByNameAndCharacteristicAndPoints("Halfling Nimbleness", null, 0)){
            RacialTrait halflingNimblenessTrait = new RacialTrait();
            halflingNimblenessTrait.setPoints(0);
            halflingNimblenessTrait.setName("Halfling Nimbleness");
        }

        if(!racialTraitRepository.existsByNameAndCharacteristicAndPoints(null, "Constitution", 1)){
            RacialTrait constitutionTrait = new RacialTrait();
            constitutionTrait.setPoints(1);
            constitutionTrait.setCharacteristic("Constitution");
        }

        if(!racialTraitRepository.existsByNameAndCharacteristicAndPoints("Menacing", null, 0)){
            RacialTrait menacingTrait = new RacialTrait();
            menacingTrait.setPoints(0);
            menacingTrait.setName("Menacing");
        }

        if(!racialTraitRepository.existsByNameAndCharacteristicAndPoints("Relentless Endurance", null, 0)){
            RacialTrait relentlessEnduranceTrait = new RacialTrait();
            relentlessEnduranceTrait.setPoints(0);
            relentlessEnduranceTrait.setName("Relentless Endurance");
        }

        if(!racialTraitRepository.existsByNameAndCharacteristicAndPoints("Savage Attacks", null, 0)){
            RacialTrait savageAttacksTrait = new RacialTrait();
            savageAttacksTrait.setPoints(0);
            savageAttacksTrait.setName("Savage Attacks");
        }

        if(!racialTraitRepository.existsByNameAndCharacteristicAndPoints(null, "to All Ability Scores", 1)){
            RacialTrait toAllAbilityScoresTrait = new RacialTrait();
            toAllAbilityScoresTrait.setPoints(1);
            toAllAbilityScoresTrait.setName("Savage Attacks");
        }

        if(!racialTraitRepository.existsByNameAndCharacteristicAndPoints(null, "to All Ability Scores", 0)){
            RacialTrait toAllAbilityScoresTrait = new RacialTrait();
            toAllAbilityScoresTrait.setPoints(1);
            toAllAbilityScoresTrait.setCharacteristic("to All Ability Scores");
        }

        if(!racialTraitRepository.existsByNameAndCharacteristicAndPoints("Extra Language", null, 0)){
            RacialTrait extraLanguageTrait = new RacialTrait();
            extraLanguageTrait.setPoints(0);
            extraLanguageTrait.setName("Extra Language");
        }

        if(!racialTraitRepository.existsByNameAndCharacteristicAndPoints(null, "Intelligence", 1)){
            RacialTrait extraLanguageTrait = new RacialTrait();
            extraLanguageTrait.setPoints(1);
            extraLanguageTrait.setCharacteristic("Intelligence");
        }

        if(!racialTraitRepository.existsByNameAndCharacteristicAndPoints("Hellish Resistance", null, 0)){
            RacialTrait hellishResistanceTrait = new RacialTrait();
            hellishResistanceTrait.setPoints(0);
            hellishResistanceTrait.setName("Hellish Resistance");
        }

        if(!racialTraitRepository.existsByNameAndCharacteristicAndPoints("Infernal Legacy", null, 0)){
            RacialTrait infernalLegacyTrait = new RacialTrait();
            infernalLegacyTrait.setPoints(0);
            infernalLegacyTrait.setName("Infernal Legacy");
        }

        if(!racialTraitRepository.existsByNameAndCharacteristicAndPoints("Flight", null, 0)){
            RacialTrait flightTrait = new RacialTrait();
            flightTrait.setPoints(0);
            flightTrait.setName("Flight");
        }

        if(!racialTraitRepository.existsByNameAndCharacteristicAndPoints("Talons", null, 0)){
            RacialTrait talonsTrait = new RacialTrait();
            talonsTrait.setPoints(0);
            talonsTrait.setName("Talons");
        }

        if(!racialTraitRepository.existsByNameAndCharacteristicAndPoints("Wind Caller", null, 0)){
            RacialTrait windCallerTrait = new RacialTrait();
            windCallerTrait.setPoints(0);
            windCallerTrait.setName("Wind Caller");
        }


    }
}
