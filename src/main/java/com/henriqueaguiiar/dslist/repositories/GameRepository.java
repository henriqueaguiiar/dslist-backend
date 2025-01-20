package com.henriqueaguiiar.dslist.repositories;

import com.henriqueaguiiar.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
