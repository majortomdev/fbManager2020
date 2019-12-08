package com.kinadev.FbManager2020.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="f_breviews")
public class Review {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long reviewId;
	
	@Column(name="playerId")
	private int playerId;
	
	@Column(name="userId")
	private int userId; 

	@Column(name="review")
	private String review;

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public Long getReviewId() {
		return reviewId;
	}

	public Review(Long reviewId, int playerId, int userId, String review) {
		this.reviewId = reviewId;
		this.playerId = playerId;
		this.userId = userId;
		this.review = review;
	}


	
	
}
