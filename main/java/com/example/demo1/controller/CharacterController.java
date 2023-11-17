package com.example.demo1.controller;

import com.example.demo1.CharacterNotFoundException;
import com.example.demo1.dto.CharacterDTO;
import com.example.demo1.service.CharacterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/character")
public class CharacterController {

    private final CharacterService characterService;

    @GetMapping("/all")
    public List<CharacterDTO> getAll(){
        return characterService.getAll();
    }

   @PostMapping("/character/save")
    public CharacterDTO saveCharacter (CharacterDTO characterDTO){
       return characterService.save(characterDTO);
    }

    @GetMapping("/character/retrieve")
    public CharacterDTO retrieveCharacter(Long characterId){
        return characterService.retrieve(characterId);
    }

    @GetMapping("/character/delete")
    public ResponseEntity<?> deleteCharacter(Long characterId){
        try{
            characterService.delete(characterId);
            return ResponseEntity.ok().body("");
        }catch(CharacterNotFoundException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
