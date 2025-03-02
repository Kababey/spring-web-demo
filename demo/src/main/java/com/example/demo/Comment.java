package com.example.demo;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Comment {
    private Long postId;
    private Long id;
    private String name;
    private String email;
    private String body;
}
