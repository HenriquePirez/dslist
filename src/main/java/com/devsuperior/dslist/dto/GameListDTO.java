package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;

import lombok.Getter;

@Getter
public class GameListDTO {
  private Long id;
  private String name;

  public GameListDTO(GameList entity) {
    id = entity.getId();
    name = entity.getName();
  }
}
