package com.henriqueaguiiar.dslist.services;


import com.henriqueaguiiar.dslist.dto.GameDTO;
import com.henriqueaguiiar.dslist.dto.GameMinDTO;
import com.henriqueaguiiar.dslist.entities.Game;
import com.henriqueaguiiar.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return dto;
    }
    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }

}
