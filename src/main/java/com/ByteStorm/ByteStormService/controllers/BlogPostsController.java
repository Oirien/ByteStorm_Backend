package com.ByteStorm.ByteStormService.controllers;

import com.ByteStorm.ByteStormService.models.BlogPosts;
import com.ByteStorm.ByteStormService.repositories.BlogPostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class BlogPostsController {
    @Autowired
    BlogPostsRepository blogPostsRepository;

    @GetMapping(value = "/api/blogpost")
    public ResponseEntity<List<BlogPosts>> getAllBlogs(){
        return  new ResponseEntity<>(blogPostsRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/api/blogpost")
    public ResponseEntity<BlogPosts> addNewBlogPost(@RequestBody BlogPosts post){
        return new ResponseEntity<>(blogPostsRepository.save(post), HttpStatus.CREATED);
    }
}
