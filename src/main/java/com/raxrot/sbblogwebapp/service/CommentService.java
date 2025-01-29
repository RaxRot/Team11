package com.raxrot.sbblogwebapp.service;

import com.raxrot.sbblogwebapp.dto.CommentDto;

public interface CommentService {
    void createComment(String postUrl, CommentDto commentDto);

    //List<CommentDto> findAllComments();

    //void deleteComment(Long commentId);
}
