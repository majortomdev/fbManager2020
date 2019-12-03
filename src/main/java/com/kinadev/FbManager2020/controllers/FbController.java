package com.kinadev.FbManager2020.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@PostMapping(value = "/comment", consumes = "application/json")
		//	,  produces = "application/json")
	public ResponseEntity<?> persistPlayer(@Valid @RequestBody Player player){
		fbRepo.save(player);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
//	@GetMapping()
//	public String getPlayerName(int indx) {
//		
//	}
	
//	@GetMapping("/{id}")
//	public ResponseEntity<Optional<Player>> getPlayerById(@PathVariable(value="id") Long playerId){
//			//throws ResourceNotFoundException {
//		Optional<Player> player = 
//				fbRepo
//				.findById(playerId);
//				//.orElseThrow(() -> new ResourceNotFoundException("Player not found on :: "+playerId));
//		System.out.println("yeeee we made it");
//		return ResponseEntity.ok().body(player);
//	}
	
	@GetMapping("/{id}")
	public Optional<Player> findPlayerName(long id) {
		Optional<Player> player = fbRepo.findById(id);
		return player;
	}
	
	
	
//	public Player createPlayer(@Valid @RequestBody Player player) {
//		fbRepo.save(player);
//		return player;
//	}

}
