package com.raxrot.sbblogwebapp.mapper;

import com.raxrot.sbblogwebapp.dto.PostDto;
import com.raxrot.sbblogwebapp.entity.Post;

public class PostMapper {

    //map Post entity to PostDTO
    public static PostDto mapToPostDto(Post post) {
        PostDto postDto=PostDto.builder()
                .id(post.getId())
                .title(post.getTitle())
                .url(post.getUrl())
                .content(post.getContent())
                .shortDescription(post.getShortDescription())
                .createdOn(post.getCreatedOn())
                .updatedOn(post.getUpdatedOn())
                .build();
        return postDto;
    }

    //map PostDTO entity to Post
    public static Post mapToPost(PostDto postDto) {
        Post post=Post.builder()
                .id(postDto.getId())
                .title(postDto.getTitle())
                .url(postDto.getUrl())
                .content(postDto.getContent())
                .shortDescription(postDto.getShortDescription())
                .createdOn(postDto.getCreatedOn())
                .updatedOn(postDto.getUpdatedOn())
                .build();
        return post;
    }
}
