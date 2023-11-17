package com.example.demo1.creator;

import com.example.demo1.entity.character.clazz.Clazz;
import com.example.demo1.entity.character.clazz.PrimaryAbility;
import com.example.demo1.entity.character.clazz.Saves;
import com.example.demo1.repository.ClassRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor

public class ClassCreator {
    private final ClassRepository classRepository;

    @PostConstruct
    public void create() {
        if (!classRepository.existsByName("Barbarian")) {
            Clazz barbarian = new Clazz();
            barbarian.setDescription("A fierce warrior who can enter a battle rage");
            barbarian.setName("Barbarian");
            barbarian.setSaves(Saves.STRENGTH_AND_CONSTITUTION);
            barbarian.setHitDie(12);
            barbarian.setPrimaryAbility(PrimaryAbility.STRENGTH);
            classRepository.save(barbarian);
        }


        if (!classRepository.existsByName("Bard")) {
            Clazz bard = new Clazz();
            bard.setDescription("An inspiring magician whose power echoes the music of creation");
            bard.setName("Bard");
            bard.setSaves(Saves.DEXTERITY_AND_CHARISMA);
            bard.setHitDie(8);
            bard.setPrimaryAbility(PrimaryAbility.CHARISMA);
            classRepository.save(bard);
        }

        if (!classRepository.existsByName("Cleric")) {
            Clazz cleric = new Clazz();
            cleric.setDescription("A priestly champion who wields divine magic in service of a higher power");
            cleric.setName("Cleric");
            cleric.setSaves(Saves.WISDOM_AND_CHARISMA);
            cleric.setHitDie(8);
            cleric.setPrimaryAbility(PrimaryAbility.WISDOM);
            classRepository.save(cleric);
        }

        if (!classRepository.existsByName("Druid")) {
            Clazz druid = new Clazz();
            druid.setDescription("A priest of the Old Faith, wielding the powers of nature and adopting animal forms");
            druid.setName("Druid");
            druid.setSaves(Saves.INTELLIGENCE_AND_WISDOM);
            druid.setHitDie(8);
            druid.setPrimaryAbility(PrimaryAbility.WISDOM);
            classRepository.save(druid);
        }
        if (!classRepository.existsByName("Fighter")) {
            Clazz fighter = new Clazz();
            fighter.setDescription("A master of martial combat, skilled with a variety of weapons and armor");
            fighter.setName("Fighter");
            fighter.setSaves(Saves.STRENGTH_AND_CONSTITUTION);
            fighter.setHitDie(10);
            fighter.setPrimaryAbility(PrimaryAbility.STRENGTH_OR_DEXTERITY);
            classRepository.save(fighter);
        }

        if (!classRepository.existsByName("Monk")) {
            Clazz monk = new Clazz();
            monk.setDescription("A master of martial arts, harnessing the power of the body in pursuit of physical and spiritual perfection");
            monk.setName("Monk");
            monk.setSaves(Saves.STRENGTH_AND_DEXTERITY);
            monk.setHitDie(8);
            monk.setPrimaryAbility(PrimaryAbility.DEXTERITY_AND_WISDOM);
            classRepository.save(monk);
        }

        if (!classRepository.existsByName("Paladin")) {
            Clazz paladin = new Clazz();
            paladin.setDescription("A holy warrior bound to a sacred oath");
            paladin.setName("Paladin");
            paladin.setSaves(Saves.WISDOM_AND_CHARISMA);
            paladin.setHitDie(8);
            paladin.setPrimaryAbility(PrimaryAbility.STRENGTH_AND_CHARISMA);
            classRepository.save(paladin);
        }

        if (!classRepository.existsByName("Ranger")) {
            Clazz ranger = new Clazz();
            ranger.setDescription("A warrior who combats threats on the edges of civilization");
            ranger.setName("Ranger");
            ranger.setSaves(Saves.STRENGTH_AND_DEXTERITY);
            ranger.setHitDie(8);
            ranger.setPrimaryAbility(PrimaryAbility.DEXTERITY_AND_WISDOM);
            classRepository.save(ranger);
        }

        if (!classRepository.existsByName("Rogue")) {
            Clazz rogue = new Clazz();
            rogue.setDescription("A scoundrel who uses stealth and trickery to overcome obstacles and enemies");
            rogue.setName("Rogue");
            rogue.setSaves(Saves.DEXTERITY_INTELLIGENCE);
            rogue.setHitDie(8);
            rogue.setPrimaryAbility(PrimaryAbility.DEXTERITY);
            classRepository.save(rogue);
        }

        if (!classRepository.existsByName("Sorcerer")) {
            Clazz sorcerer = new Clazz();
            sorcerer.setDescription("A spellcaster who draws on inherent magic from a gift or bloodline");
            sorcerer.setName("Sorcerer");
            sorcerer.setSaves(Saves.CONSTITUTION_AND_CHARISMA);
            sorcerer.setHitDie(6);
            sorcerer.setPrimaryAbility(PrimaryAbility.CHARISMA);
            classRepository.save(sorcerer);
        }

        if (!classRepository.existsByName("Warlock")) {
            Clazz warlock = new Clazz();
            warlock.setDescription("A wielder of magic that is derived from a bargain with an extraplanar entity");
            warlock.setName("Warlock");
            warlock.setSaves(Saves.WISDOM_AND_CHARISMA);
            warlock.setHitDie(8);
            warlock.setPrimaryAbility(PrimaryAbility.CHARISMA);
            classRepository.save(warlock);
        }

        if (!classRepository.existsByName("Wizard")) {
            Clazz wizard = new Clazz();
            wizard.setDescription("A scholarly magic-user capable of manipulating the structures of reality");
            wizard.setName("Wizard");
            wizard.setSaves(Saves.INTELLIGENCE_AND_WISDOM);
            wizard.setHitDie(6);
            wizard.setPrimaryAbility(PrimaryAbility.INTELLIGENCE);
            classRepository.save(wizard);
        }

        if (!classRepository.existsByName("Artificer")) {
            Clazz artificer = new Clazz();
            artificer.setDescription("Masters of invention, artificers use ingenuity and magic to unlock extraordinary capabilities in objects.");
            artificer.setName("Artificer");
            artificer.setSaves(Saves.CONSTITUTION_AND_INTELLIGENCE);
            artificer.setHitDie(8);
            artificer.setPrimaryAbility(PrimaryAbility.INTELLIGENCE);
            classRepository.save(artificer);
        }

        if (!classRepository.existsByName("Blood hunter")) {
            Clazz blood_hunter = new Clazz();
            blood_hunter.setDescription("Willing to suffer whatever it takes to achieve victory, these adept warriors have forged themselves into a potent force dedicated to protecting the innocent.");
            blood_hunter.setName("Blood Hunter");
            blood_hunter.setSaves(Saves.DEXTERITY_INTELLIGENCE);
            blood_hunter.setHitDie(10);
            blood_hunter.setPrimaryAbility(PrimaryAbility.STRENGTH_OR_DEXTERITY_AND_INTELLIGENCE_OR_WISDOM);
            classRepository.save(blood_hunter);
        }
    }
}
