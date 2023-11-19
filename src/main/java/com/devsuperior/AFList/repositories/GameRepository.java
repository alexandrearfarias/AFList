package com.devsuperior.AFList.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.AFList.entidades.Game;
import com.devsuperior.AFList.projections.GameMinProjection;

public interface GameRepository  extends JpaRepository<Game,Long >{
	
	@Query(nativeQuery= true, value ="""
			SELECT tb_jogo.id, tb_jogo.titulo, tb_jogo.ano, tb_jogo.img_url AS `imgurl`,tb_belonging.position, tb_jogo.descricao_curta
			AS `descricaoCurta`
			FROM tb_jogo
			INNER JOIN tb_belonging ON tb_jogo.id = tb_belonging.game_id
			WHERE tb_belonging.list_id = :listId
			ORDER  BY tb_belonging.position
			""")
	List<GameMinProjection> searchByList(Long listId);
	
}
