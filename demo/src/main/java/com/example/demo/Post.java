package com.example.demo;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Post {
    private Long userId;
    private Long id;
    private String title;
    private String body;
}
