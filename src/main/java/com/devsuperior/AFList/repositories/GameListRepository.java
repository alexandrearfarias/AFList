package com.devsuperior.AFList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.AFList.entidades.GameList;

public interface GameListRepository  extends JpaRepository<GameList,Long >{
	

}
