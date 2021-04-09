package com.biliaiev.DB_LMS_Diploma.service;

import com.biliaiev.DB_LMS_Diploma.dao.GenericDao;
import com.biliaiev.DB_LMS_Diploma.domain.Feed;
import com.biliaiev.DB_LMS_Diploma.domain.Group;
import com.biliaiev.DB_LMS_Diploma.domain.Post;

public class FeedServiceImpl implements FeedService {
    GenericDao<Feed> feedDao;

    public FeedServiceImpl(GenericDao<Feed> feedDao) {
        this.feedDao = feedDao;
    }

    @Override
    public Feed createFeed(Group group) {
        return new Feed(group);
    }

    @Override
    public boolean addPost(Feed feed, Post post) {
        return feed.addPost(post);
    }

    @Override
    public boolean saveFeed(Feed feed) {
        feedDao.saveEntity(feed);

        return  true;
    }
}
