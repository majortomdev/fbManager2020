package com.kinadev.FbManager2020.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kinadev.FbManager2020.models.Review;
import com.kinadev.FbManager2020.models.User;

@Repository
@Transactional
public interface UserRepository extends CrudRepository<User, Long> {


    @Query("SELECT u FROM User u WHERE u.userName = :username AND u.userPassword= :password")
    public Optional<User> checkIfUser(@Param("username") String username,@Param("password") String password);
}
