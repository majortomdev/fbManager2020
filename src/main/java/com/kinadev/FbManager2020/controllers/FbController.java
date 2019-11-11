package com.kinadev.FbManager2020.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kinadev.FbManager2020.models.Player;
import com.kinadev.FbManager2020.repositories.FbRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/")
public class FbController {
	
	@Autowired
	private FbRepository fbRepo;
	
	@GetMapping("players")
	public List<Player> getAllPlayers() {
		return (List<Player>) fbRepo.findAll();
	}
	
	@PostMapping(value = "players", consumes = "application/json", 
			 produces = "application/json")
	public Player createPlayer(@Valid @RequestBody Player player) {
		return fbRepo.save(player);
	//	return player;
	}

}
