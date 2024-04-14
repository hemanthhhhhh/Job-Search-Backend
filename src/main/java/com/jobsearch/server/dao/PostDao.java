package com.jobsearch.server.dao;

import com.jobsearch.server.model.PostModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostDao extends MongoRepository<PostModel, String> {
}