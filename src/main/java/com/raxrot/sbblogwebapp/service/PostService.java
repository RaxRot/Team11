package com.raxrot.sbblogwebapp.service;

import com.raxrot.sbblogwebapp.dto.PostDto;

import java.util.List;

public interface PostService {
    List<PostDto>findAllPosts();
}
