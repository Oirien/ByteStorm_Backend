package com.ByteStorm.ByteStormService;

import com.ByteStorm.ByteStormService.models.BlogPosts;
import com.ByteStorm.ByteStormService.repositories.BlogPostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class ByteStormServiceApplication implements CommandLineRunner {
	@Autowired
	BlogPostsRepository blogPostsRepository;

	public static void main(String[] args) {
		SpringApplication.run(ByteStormServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		blogPostsRepository.findAll().forEach(post -> System.out.println(post.getTitle()));
	}
}
