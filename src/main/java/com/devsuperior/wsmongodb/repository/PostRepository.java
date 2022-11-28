package com.devsuperior.wsmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.wsmongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
