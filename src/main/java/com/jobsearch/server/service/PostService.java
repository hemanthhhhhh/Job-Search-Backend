package com.jobsearch.server.service;

import com.jobsearch.server.dto.PostDTO;
import com.jobsearch.server.model.PostModel;

import java.util.List;

public interface PostService {

    public List<PostModel> getAllPosts();

    public PostModel savePost(PostDTO post);
}