package com.devsuperior.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_belonging")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Belonging {

  @EmbeddedId
  private BelongingPK id = new BelongingPK();

  private Integer position;
}
