package com.raxrot.sbblogwebapp.service.implementation;

import com.raxrot.sbblogwebapp.dto.PostDto;
import com.raxrot.sbblogwebapp.entity.Post;
import com.raxrot.sbblogwebapp.mapper.PostMapper;
import com.raxrot.sbblogwebapp.repository.PostRepository;
import com.raxrot.sbblogwebapp.service.PostService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImplementation implements PostService {

    private PostRepository postRepository;
    public PostServiceImplementation(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<PostDto> findAllPosts() {
        List<Post> posts = postRepository.findAll();
        return posts.stream()
                .map((PostMapper::mapToPostDto))
                .collect(Collectors.toList());
    }
}
