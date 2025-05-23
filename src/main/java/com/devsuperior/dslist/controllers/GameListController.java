package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.dto.ReplacementDTO;
import com.devsuperior.dslist.services.GameListService;
import com.devsuperior.dslist.services.GameService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping(value = "/lists")
public class GameListController {
  
  @Autowired
  private GameListService gameListService;

  @Autowired
  private GameService gameService;

  @GetMapping
  public List<GameListDTO> findAll() {
    List<GameListDTO> result = gameListService.findAll();
    return result;
  }

  @GetMapping(value = "/{id}/games")
  public List<GameMinDTO> findByList(@PathVariable Long id) {
    List<GameMinDTO> result = gameService.findByList(id);
    return result;
  }

  @PostMapping(value = "/{listId}/replacement")
	public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body) {
		gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
	}
}
