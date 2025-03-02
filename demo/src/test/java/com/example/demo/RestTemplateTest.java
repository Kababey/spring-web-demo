package com.example.demo;

import org.apache.coyote.Response;
import org.junit.jupiter.api.Test;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Arrays;

public class RestTemplateTest {

    RestTemplate restTemplate = new RestTemplate();

    public static final String BASE_URL = "https://jsonplaceholder.typicode.com/";

    @Test
    public void bringAllPosts(){
        URI uri = UriComponentsBuilder.fromHttpUrl(BASE_URL)
                .pathSegment("posts")
                .build()
                .toUri();
        RequestEntity<Void> requestEntity = RequestEntity.get(uri).build();

        ResponseEntity<Post[]> posts = restTemplate.exchange(requestEntity, Post[].class);

        System.out.println(Arrays.asList(posts.getBody()));
    }

    @Test
    public void bringPostWithId(){
        URI uri = UriComponentsBuilder.fromHttpUrl(BASE_URL)
                .pathSegment("posts", "{id}")
                .buildAndExpand(2)
                .toUri();
        RequestEntity<Void> requestEntity = RequestEntity.get(uri).build();

        ResponseEntity<Post> post = restTemplate.exchange(requestEntity, Post.class);

        System.out.println(post.getBody());
    }


    @Test
    public void addPost(){
        URI uri = UriComponentsBuilder.fromHttpUrl(BASE_URL)
                .pathSegment("posts")
                .build()
                .toUri();

        RequestEntity<Post> requestEntity= RequestEntity.post(uri).body(new Post(1L, 1L, "06", "Ankara"));

        ResponseEntity<Post> response = restTemplate.exchange(requestEntity, Post.class);

        System.out.println(response.getBody());
    }

    @Test
    public void bringPostWithUserId(){
        URI uri = UriComponentsBuilder.fromHttpUrl(BASE_URL)
                .pathSegment("posts")
                .queryParam("userId", 2)
                .build()
                .toUri();

        RequestEntity<Void> requestEntity = RequestEntity.get(uri).build();

        ResponseEntity<Post[]> response = restTemplate.exchange(requestEntity, Post[].class);

        System.out.println(Arrays.asList(response.getBody()));
    }

    @Test
    public void updateComment() {
        URI uri = UriComponentsBuilder.fromHttpUrl(BASE_URL)
                .pathSegment("comments", "5")
                .build()
                .toUri();

        Comment newComment = new Comment(12L, 5L, "tlh", "kbby", "tatatatatat");

        RequestEntity<Comment> requestEntity = RequestEntity.put(uri).body(newComment);

        ResponseEntity<Comment> response = restTemplate.exchange(requestEntity, Comment.class);

        System.out.println(response.getBody());
    }

    @Test
    public void deletePost() {
        URI uri = UriComponentsBuilder.fromHttpUrl(BASE_URL)
                .pathSegment("posts", "1")
                .build()
                .toUri();
        RequestEntity<Void> requestEntity = RequestEntity.delete(uri).build();

        ResponseEntity<Void> response = restTemplate.exchange(requestEntity, Void.class);

        System.out.println(response.getBody());
    }
}

