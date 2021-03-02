package com.biliaiev.DB_LMS_Diploma.domain;

import java.util.LinkedList;

public class Feed {
    private Group group;
    private LinkedList<Post> posts;

    public Feed(Group group) {
        this.group = group;
        this.posts = new LinkedList<>();
    }

    public Group getGroup() {
        return group;
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public LinkedList<Post> getPosts() {
        return posts;
    }
}
