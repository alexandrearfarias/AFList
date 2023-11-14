package com.devsuperior.AFList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.AFList.entidades.Game;

public interface GameRepository  extends JpaRepository<Game,Long >{
	

}
