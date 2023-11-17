package com.example.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping
    String getPeople(Model model) {
        model.addAttribute("Home Page", "asd");
        return "index";
    }

    @GetMapping("/battle_ground")
    public String showBattleGround() {
        return "battle_ground";
    }

    @GetMapping("/character")
    public String getCharacters(){
        return "character";
    }

    @GetMapping("/character_creation")
    public String createCharacter(){
        return "character_creation";
    }
}
