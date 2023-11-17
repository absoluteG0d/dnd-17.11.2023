package com.example.demo1.creator;

import com.example.demo1.entity.character.race.Race;
import com.example.demo1.entity.character.race.RacialTrait;
import com.example.demo1.repository.RaceRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RaceCreator {
    private final RaceRepository raceRepository;
    @PostConstruct
    public void create() {
        if (!raceRepository.existsByName("Dragonborn")) {
            Race dragonborn = new Race();
            dragonborn.setRacialTrait(RacialTrait.STRENGTH_PLUS_2,
                    RacialTrait.CHARISMA_PLUS_1,
                    RacialTrait.DRACONIC_ANCESTRY,
                    RacialTrait.BREATH_WEAPON,
                    RacialTrait.DAMAGE_RESISTANCE);
        }
        if (!raceRepository.existsByName("Dwarf")) {
            Race dwarf = new Race();
            dwarf.setRacialTrait(RacialTrait.CONSTITUTION_PLUS_2.points(2),
                    RacialTrait.DARKVISION,
                    RacialTrait.DWARVEN_RESILIENCE,
                    RacialTrait.DWARVEN_COMBAT_TRAINING,
                    RacialTrait.STONECUNNING);
        }
        if (!raceRepository.existsByName("Elf")) {
            Race elf = new Race();
            elf.setRacialTrait(RacialTrait.DEXTERITY_PLUS_2.points(2),
                    RacialTrait.DARKVISION,
                    RacialTrait.KEEN_SENSES,
                    RacialTrait.FEY_ANCESTRY,
                    RacialTrait.TRANCE);
        }
        if (!raceRepository.existsByName("Gnome")) {
            Race gnome = new Race();
            gnome.setRacialTrait(RacialTrait.INTELLIGENCE_PLUS_2.points(2),
                    RacialTrait.DARKVISION,
                    RacialTrait.GNOME_CUNNING);
        }
        if (!raceRepository.existsByName("Helf-Elf")) {
            Race half_elf = new Race();
            half_elf.setRacialTrait(RacialTrait.CHARISMA_PLUS_2.points(2),
                    RacialTrait.TWO_OTHER_ABILITY_SCORES_PLUS_1,
                    RacialTrait.DARKVISION,
                    RacialTrait.FEY_ANCESTRY,
                    RacialTrait.SKILL_VERSATILITY);
        }
        if (!raceRepository.existsByName("Halfing")) {
            Race halfing = new Race();
            halfing.setRacialTrait(RacialTrait.DEXTERITY_PLUS_2.points(2),
                    RacialTrait.LUCKY,
                    RacialTrait.BRAVE,
                    RacialTrait.HALFLING_NIMBLENESS);
        }
        if (!raceRepository.existsByName("Half-Orc")) {
            Race half_orc = new Race();
            half_orc.setRacialTrait(RacialTrait.STRENGTH_PLUS_2.points(2),
                    RacialTrait.CONSTITUTION_PLUS_1,
                    RacialTrait.DARKVISION,
                    RacialTrait.MENACING,
                    RacialTrait.RELENTLESS_ENDURANCE,
                    RacialTrait.SAVAGE_ATTACKS);
        }
        if (!raceRepository.existsByName("Human")) {
            Race human = new Race();
            human.setRacialTrait(RacialTrait.TO_ALL_ABILITY_SCORES_PLUS_1.points(2),
                    RacialTrait.EXTRA_LANGUAGE);
        }
        if (!raceRepository.existsByName("Tiefling")) {
            Race tiefling = new Race();
            tiefling.setRacialTrait(RacialTrait.CHARISMA_PLUS_2.points(2),
                    RacialTrait.INTELLIGENCE_PLUS_1,
                    RacialTrait.DARKVISION,
                    RacialTrait.HELLISH_RESISTANCE,
                    RacialTrait.INFERNAL_LEGACY);
        }
        if (!raceRepository.existsByName("Aarakocra")) {
            Race aarakocra = new Race();
            aarakocra.setRacialTrait(RacialTrait.FLIGHT.points(2),
                    RacialTrait.TALONS,
                    RacialTrait.WIND_CALLER);
        }
        if (!raceRepository.existsByName("Aasimar")) {
            Race aasimar = new Race();
            aasimar.setRacialTrait(RacialTrait.CELESTIAL_RESISTANCE.points(2),
                    RacialTrait.DARKVISION,
                    RacialTrait.HEALING_HANDS,
                    RacialTrait.LIGHT_BEARER,
                    RacialTrait.CELESTIAL_REVELATION);
        }
        if (!raceRepository.existsByName("Air Genasi")) {
            Race air_genasi = new Race();
            air_genasi.setRacialTrait(RacialTrait.DARKVISION.points(2),
                    RacialTrait.UNENDING_BREATH,
                    RacialTrait.LIGHTING_RESISTANCE,
                    RacialTrait.MINGLE_WITH_THE_WIND);
        }

        if (!raceRepository.existsByName("Bugbear")) {
            Race bugbear = new Race();
            bugbear.setRacialTrait(RacialTrait.DARKVISION.points(2),
                    RacialTrait.FEY_ANCESTRY,
                    RacialTrait.LONG_LIMBED,
                    RacialTrait.POWERFUL_BUILD,
                    RacialTrait.SNEAKY,
                    RacialTrait.SURPRISE_ATTACK);
        }
        if (!raceRepository.existsByName("CENTAUR")) {
            Race centaur = new Race();
            centaur.setRacialTrait(RacialTrait.FEY.points(2),
                    RacialTrait.EQUINE_BUILD,
                    RacialTrait.HOOVES,
                    RacialTrait.NATURAL_AFFINITY);
        }
        if (!raceRepository.existsByName("Changeling")) {
            Race changeling = new Race();
            changeling.setRacialTrait(RacialTrait.FEY.points(2),
                    RacialTrait.CHANGELING_INSTINCTS,
                    RacialTrait.SHAPECHANGER);
        }
        if (!raceRepository.existsByName("Deep Gnome")) {
            Race deep_gnome = new Race();
            deep_gnome.setRacialTrait(RacialTrait.GNOME.points(2),
                    RacialTrait.DARKVISION,
                    RacialTrait.GIFT_OF_THE_SVIRFNEBLIN,
                    RacialTrait.GNOMISH_MAGIC_RESISTANCE,
                    RacialTrait.INFERNAL_LEGACY);
        }

    }
}
