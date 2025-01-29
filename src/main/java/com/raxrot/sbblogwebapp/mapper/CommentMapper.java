package com.raxrot.sbblogwebapp.mapper;

import com.raxrot.sbblogwebapp.dto.CommentDto;
import com.raxrot.sbblogwebapp.entity.Comment;

public class CommentMapper {
    // Convert comment entity to comment DTO
    public static CommentDto mapToCommentDto(Comment comment) {
        CommentDto commentDto = new CommentDto();
        commentDto.setId(comment.getId());
        commentDto.setName(comment.getName());
        commentDto.setEmail(comment.getEmail());
        commentDto.setContent(comment.getContent());
        commentDto.setCreatedOn(comment.getCreatedOn());
        commentDto.setUpdatedOn(comment.getUpdatedOn());
        return commentDto;
    }

    // Convert comment DTO to comment entity
    public static Comment mapToComment(CommentDto commentDto) {
        Comment comment = new Comment();
        comment.setId(commentDto.getId());
        comment.setName(commentDto.getName());
        comment.setEmail(commentDto.getEmail());
        comment.setContent(commentDto.getContent());
        comment.setCreatedOn(commentDto.getCreatedOn());
        comment.setUpdatedOn(commentDto.getUpdatedOn());
        return comment;
    }
}