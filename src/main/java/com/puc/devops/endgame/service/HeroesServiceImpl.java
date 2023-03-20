package com.puc.devops.endgame.service;

import com.puc.devops.endgame.model.Hero;
import com.puc.devops.endgame.repository.HeroesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class HeroesServiceImpl implements HeroesService {

    @Autowired
    private HeroesRepository heroesRepository;
    @Override
    public List<Hero> listHeroes() {
        return heroesRepository.findAll();
    }

    @Override
    public Hero getHeroByName(String name){
        return null;
    }

}
