package com.biliaiev.DB_LMS_Diploma.service;

import com.biliaiev.DB_LMS_Diploma.domain.HomeTask;
import com.biliaiev.DB_LMS_Diploma.domain.Post;
import com.biliaiev.DB_LMS_Diploma.domain.User;

import java.time.LocalDate;

public interface PostService {
    Post createPost(String text, LocalDate datePosted, User author);

    boolean editText(Post post, String text);
}
