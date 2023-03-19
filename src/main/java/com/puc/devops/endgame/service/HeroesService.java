package com.puc.devops.endgame.service;

import com.puc.devops.endgame.model.Hero;

import java.util.List;

public interface HeroesService {

    public List<Hero> listHeroes();

    public Hero getHeroByName(String name);
}
