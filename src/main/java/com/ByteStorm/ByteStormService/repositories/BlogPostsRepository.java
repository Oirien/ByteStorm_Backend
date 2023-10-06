package com.ByteStorm.ByteStormService.repositories;

import com.ByteStorm.ByteStormService.models.BlogPosts;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface BlogPostsRepository extends MongoRepository<BlogPosts, String> {

    @Query("{ 'title' : ?0 }")//@Query("{ 'firstname' : ?0 }")
    List<BlogPosts> findByTitle(String title);
}
