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
import com.kinadev.FbManager2020.models.User;
import com.kinadev.FbManager2020.repositories.FbRepository;
import com.kinadev.FbManager2020.repositories.ReviewRepository;
import com.kinadev.FbManager2020.repositories.UserRepository;

import java.util.Date;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/")
public class FbController {
	 
	@Autowired
	private FbRepository fbRepo;
	@Autowired
	private ReviewRepository reviewRepo;
	@Autowired
	private UserRepository userRepo;
	
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
		Optional<Player> player = fbRepo.findById(playerId);
		System.out.println("here it is ..........."+player);
		return ResponseEntity.ok().body(player);
	}
	
	@PostMapping("/reviews")
	public Review createReview(@RequestBody Review review) {
		System.out.println("springboot post review: "+review.getReview()); 
		System.out.println("springboot post playerid: "+review.getPlayerId()); 
		System.out.println("springboot post userid: "+review.getUserId()); 
		System.out.println("springboot post reviewid: "+review.getReviewId()); 
		reviewRepo.save(review);
		return review;
	}
	
	@GetMapping("/users/{uname}/{pword}")
	public ResponseEntity<Optional<User>> checkUserLogin(@PathVariable(value="uname") String usname, 
			@PathVariable(value="pword") String pwword) {
		Optional<User> user = userRepo.checkIfUser(usname, pwword);
		System.out.println("peek a booooooooooooo..................."+user);
		return  ResponseEntity.ok().body(user);
	}

}
