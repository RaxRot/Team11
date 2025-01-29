package com.raxrot.sbblogwebapp.service.implementation;

import com.raxrot.sbblogwebapp.dto.CommentDto;
import com.raxrot.sbblogwebapp.entity.Comment;
import com.raxrot.sbblogwebapp.entity.Post;
import com.raxrot.sbblogwebapp.mapper.CommentMapper;
import com.raxrot.sbblogwebapp.repository.CommentRepository;
import com.raxrot.sbblogwebapp.repository.PostRepository;
import com.raxrot.sbblogwebapp.service.CommentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentServiceImplementation implements CommentService {
    private CommentRepository commentRepository;
    private PostRepository postRepository;

    public CommentServiceImplementation(CommentRepository commentRepository, PostRepository postRepository) {
        this.commentRepository = commentRepository;
        this.postRepository = postRepository;
    }

    @Override
    public void createComment(String postUrl, CommentDto commentDto) {

        Post post = postRepository.findByUrl(postUrl).get();
        Comment comment = CommentMapper.mapToComment(commentDto);
        comment.setPost(post);
        commentRepository.save(comment);
    }

    @Override
    public List<CommentDto> findAllComments() {
        List<Comment> comments = commentRepository.findAll();
        return comments.stream()
                .map(CommentMapper::mapToCommentDto)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteComment(Long commentId) {
        commentRepository.deleteById(commentId);
    }

}
