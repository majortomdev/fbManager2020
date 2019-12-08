package com.kinadev.FbManager2020.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kinadev.FbManager2020.models.Player;
import com.kinadev.FbManager2020.models.Review;
import com.kinadev.FbManager2020.repositories.FbRepository;
import com.kinadev.FbManager2020.repositories.ReviewRepository;

import java.util.Date;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/")
public class FbController {
	Date d= new Date();
	@Autowired
	private FbRepository fbRepo;
	@Autowired
	private ReviewRepository reviewRepo;
	
	/*
	 * @GetMapping("/players") public List<Player> getAllPlayers() { return
	 * (List<Player>) fbRepo.findAll(); }
	 */
	
	@GetMapping("/players")
	public ResponseEntity<Iterable<Player>>  getAllPlayers() {
		Iterable<Player> players = fbRepo.findAll();
		
		return ResponseEntity.ok().body(players);
	}
	
	@GetMapping("/players/{id}")
	public ResponseEntity<Optional<Player>>  getPlayerById(@PathVariable(value= "id") Long playerId) {
			//throws ResourceNotFoundException {
		System.out.println("hello from springboot get  <at: "+d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());;
		Optional<Player> player = fbRepo.findById(playerId);
//				.orElseThrow(() -> 
//		ResourceNotFoundException("player not found for id :: "+playerId));
		return ResponseEntity.ok().body(player);
	}
	
	//@PostMapping(value = "players"    //, consumes = "application/json", 
			 //produces = "application/json")
	
//	@PostMapping("/reviews/{id}")
//	public Review createReview(@Valid @RequestBody String rev) {
//		Review review = new Review(123l, 234, 3443, rev);
//		return reviewRepo.save(review);
//	}
	
	@PostMapping("/reviews")
	
	public Review createReview(@RequestBody Review review) {
		System.out.println("springboot post: "+review.getReview()); 
		reviewRepo.save(review);
		return review;
	}
	

}
