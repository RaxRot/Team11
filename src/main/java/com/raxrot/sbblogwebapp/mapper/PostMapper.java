package com.raxrot.sbblogwebapp.mapper;

import com.raxrot.sbblogwebapp.dto.PostDto;
import com.raxrot.sbblogwebapp.entity.Post;

import java.util.stream.Collectors;

public class PostMapper {

    //map Post entity to PostDTO
    public static PostDto mapToPostDto(Post post) {
        return new PostDto(
                post.getId(),
                post.getTitle(),
                post.getUrl(),
                post.getContent(),
                post.getShortDescription(),
                post.getCreatedOn(),
                post.getUpdatedOn(),
                post.getComments().stream().map(comment -> CommentMapper.mapToCommentDto(comment))
                        .collect(Collectors.toSet())
        );
    }

    //map PostDTO entity to Post
    public static Post mapToPost(PostDto postDto) {
        return new Post(
                postDto.getId(),
                postDto.getTitle(),
                postDto.getUrl(),
                postDto.getContent(),
                postDto.getShortDescription(),
                postDto.getCreatedOn(),
                postDto.getUpdatedOn()
        );
    }
}
