package com.henriqueaguiiar.dslist.repositories;


import com.henriqueaguiiar.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
