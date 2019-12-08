package com.kinadev.FbManager2020.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kinadev.FbManager2020.models.Review;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Long> {

}
