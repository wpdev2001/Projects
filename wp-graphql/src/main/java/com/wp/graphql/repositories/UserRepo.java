package com.wp.graphql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wp.graphql.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
