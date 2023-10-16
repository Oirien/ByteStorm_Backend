package com.ByteStorm.ByteStormService;

import com.ByteStorm.ByteStormService.models.BlogPosts;
import com.ByteStorm.ByteStormService.repositories.BlogPostsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataMongoTest
class ByteStormServiceApplicationTests {


	@Autowired
	BlogPostsRepository blogPostRepository;


	@Test
	void contextLoads() {
	}

	@Test
	public void getAllBlogPosts(){
		List<BlogPosts> allPosts = blogPostRepository.findAll();
		System.out.println(allPosts);
//		assertNotNull(allPosts);
//		assertTrue((allPosts.size() != 0 ));
	}

	@Test
	public void canGetPostByName(){
		List<BlogPosts> post = blogPostRepository.findByTitle("Test");
		System.out.println(post);
        assertNotNull(post);
	}


}
