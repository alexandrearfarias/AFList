package com.devsuperior.AFList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.AFList.dto.GameDTO;
import com.devsuperior.AFList.dto.GameMinDTO;
import com.devsuperior.AFList.entidades.Game;
import com.devsuperior.AFList.projections.GameMinProjection;
import com.devsuperior.AFList.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly= true)
	public List<GameMinDTO> findAll(){
		var result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
	@Transactional(readOnly= true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}
	
	@Transactional(readOnly= true)
	public List<GameMinDTO> findByList(Long ListId){
		List<GameMinProjection> result = gameRepository.searchByList(ListId);
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
