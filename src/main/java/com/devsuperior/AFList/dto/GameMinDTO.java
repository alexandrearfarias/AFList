package com.devsuperior.AFList.dto;

import com.devsuperior.AFList.entidades.Game;
import com.devsuperior.AFList.projections.GameMinProjection;

public class GameMinDTO {
	private long id;
	private String titulo;
	private Integer ano;
	private String imgUrl;
	private String descricaoCurta;
	
	public GameMinDTO() {}

	public GameMinDTO(Game Entity) {
		id = Entity.getId();
		titulo = Entity.getTitulo();
		ano = Entity.getAno();
		imgUrl = Entity.getImgUrl();
		descricaoCurta = Entity.getDescricaoCurta();
	}
	
	public GameMinDTO(GameMinProjection projection) {
		id = projection.getId();
		titulo = projection.getTitulo();
		ano = projection.getAno();
		imgUrl = projection.getImgUrl();
		descricaoCurta = projection.getDescricaoCurta();
	}

	public long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public Integer getAno() {
		return ano;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getDescricaoCurta() {
		return descricaoCurta;
	}
	
}
