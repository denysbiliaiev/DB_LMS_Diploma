package com.biliaiev.DB_LMS_Diploma.service;

import com.biliaiev.DB_LMS_Diploma.dao.GenericDao;
import com.biliaiev.DB_LMS_Diploma.domain.HomeTask;
import com.biliaiev.DB_LMS_Diploma.domain.Lesson;
import com.biliaiev.DB_LMS_Diploma.domain.Post;
import com.biliaiev.DB_LMS_Diploma.domain.User;

import java.time.LocalDate;

public class PostServiceImpl implements PostService {
    GenericDao<Post> postDao;

    public PostServiceImpl(GenericDao<Post> postDao) {
        this.postDao = postDao;
    }

    @Override
    public Post createPost(String text, LocalDate datePosted, User author) {
        return new Post(text, datePosted, author);
    }

    @Override
    public boolean editText(Post post, String text) {
        return post.setText(text);
    }
}
