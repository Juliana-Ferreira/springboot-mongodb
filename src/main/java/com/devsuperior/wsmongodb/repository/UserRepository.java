package com.devsuperior.wsmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.wsmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
