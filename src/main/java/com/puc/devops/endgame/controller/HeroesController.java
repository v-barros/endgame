package com.puc.devops.endgame.controller;

import com.puc.devops.endgame.model.Hero;
import com.puc.devops.endgame.service.HeroesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/heroes")
public class HeroesController {

    @Autowired
    private HeroesService heroesService;

    @GetMapping
    public List<Hero> getHeroes(){
        return heroesService.listHeroes();
    }
}
