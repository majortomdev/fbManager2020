package com.kinadev.FbManager2020.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kinadev.FbManager2020.models.Player;

@Repository
public interface FbRepository extends CrudRepository<Player, Long>{

}
