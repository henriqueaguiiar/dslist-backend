package com.henriqueaguiiar.dslist.controllers;


import com.henriqueaguiiar.dslist.dto.GameListDTO;
import com.henriqueaguiiar.dslist.dto.GameMinDTO;
import com.henriqueaguiiar.dslist.dto.ReplacementDTO;
import com.henriqueaguiiar.dslist.services.GameListService;
import com.henriqueaguiiar.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameListDTO findById(@PathVariable Long id) {
        GameListDTO result = gameListService.findById(id);
        return result;
    }

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findGames(@PathVariable Long listId) {
        List<GameMinDTO> result = gameService.findByGameList(listId);
        return result;
    }

    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body) {
        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
    }

    @GetMapping
    public List<Produto> buscar(@RequestParam("nome")String nome){
        return produtoRepository.findByNome(nome);
    }
}

}
