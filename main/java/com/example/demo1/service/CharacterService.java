package com.example.demo1.service;

import com.example.demo1.CharacterNotFoundException;
import com.example.demo1.repository.CharacterRepository;
import com.example.demo1.entity.character.clazz.Clazz;
import com.example.demo1.entity.character.creation.CharacterInfo;
import com.example.demo1.entity.character.creation.MainInformation;
import com.example.demo1.entity.character.race.Race;
import com.example.demo1.dto.CharacterDTO;
import com.example.demo1.dto.ClazzDTO;
import com.example.demo1.dto.MainInformationDTO;
import com.example.demo1.dto.RaceDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CharacterService {

    private final CharacterRepository repo;



    private CharacterDTO convertToDTO(CharacterInfo characterInfo){
        CharacterDTO dto = new CharacterDTO();
        BeanUtils.copyProperties(characterInfo, dto);
        dto.setMainInformation(convertToDTO(characterInfo.getMainInformation()));
        return dto;
    }

    private CharacterInfo convertToEntity(CharacterDTO characterDTO){
        CharacterInfo entity = new CharacterInfo();
        BeanUtils.copyProperties(characterDTO, entity);
        return entity;
    }

    private MainInformationDTO convertToDTO(MainInformation mainInformation){
        MainInformationDTO dto = new MainInformationDTO();
        BeanUtils.copyProperties(mainInformation, dto);
        dto.setClazz(convertToDTO(mainInformation.getClazz()));
        dto.setRace(convertToDTO(mainInformation.getRace()));
        return dto;
    }

    private MainInformation convertToEntity(MainInformationDTO mainInformationDTO){
        MainInformation entity = new MainInformation();
        BeanUtils.copyProperties(mainInformationDTO, entity);
        return entity;
    }

    private ClazzDTO convertToDTO(Clazz clazz){
        ClazzDTO dto = new ClazzDTO();
        BeanUtils.copyProperties(clazz, dto);
        return dto;
    }

    private Clazz convertToEntity(ClazzDTO clazzDTO){
        Clazz entity = new Clazz();
        BeanUtils.copyProperties(clazzDTO, entity);
        return entity;
    }

    private RaceDTO convertToDTO(Race race){
        RaceDTO dto = new RaceDTO();
        BeanUtils.copyProperties(race, dto);
        return dto;
    }


    private Race convertToEntity(RaceDTO raceDTO){
        Race entity = new Race();
        BeanUtils.copyProperties(raceDTO, entity);
        return entity;
    }


    public List<CharacterDTO> getAll(){
        List<CharacterInfo> characters = repo.findAll();
        List<CharacterDTO> charactersDTO = new ArrayList<>();
        for (CharacterInfo character : characters) {
            charactersDTO.add(convertToDTO(character));
        }
        return charactersDTO;
    }



    public CharacterDTO save(CharacterDTO characterDTO) {
        CharacterInfo save = repo.save(convertToEntity(characterDTO));
        return convertToDTO(save);
    }

    public CharacterDTO retrieve(Long characterId){
        Optional<CharacterInfo> retrieve = repo.findById(characterId);
        return retrieve
                .map(this::convertToDTO)
                .orElse(null);
    }

    public void delete(Long characterId) throws CharacterNotFoundException {
        Long count = repo.countById(characterId);
        if (count == null || count == 0) {
            throw new CharacterNotFoundException("Could not find any characters with ID " + characterId);
        }
        repo.deleteById(characterId);
    }

}
