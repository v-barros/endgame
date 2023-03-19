package com.puc.devops.endgame.repository;

import com.puc.devops.endgame.model.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface HeroesRepository extends JpaRepository<Hero, UUID> {
}
