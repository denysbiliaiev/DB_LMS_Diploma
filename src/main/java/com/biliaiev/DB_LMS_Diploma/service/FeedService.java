package com.biliaiev.DB_LMS_Diploma.service;

import com.biliaiev.DB_LMS_Diploma.dao.GenericDao;
import com.biliaiev.DB_LMS_Diploma.domain.Feed;
import com.biliaiev.DB_LMS_Diploma.domain.Group;
import com.biliaiev.DB_LMS_Diploma.domain.Post;

public interface FeedService {
    Feed createFeed(Group group);

    boolean addPost(Feed feed, Post post);

    boolean saveFeed(Feed feed);
}
