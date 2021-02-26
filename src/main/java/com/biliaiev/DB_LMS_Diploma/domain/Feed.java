package com.biliaiev.DB_LMS_Diploma.domain;

import java.util.LinkedHashSet;
import java.util.Set;

public class Feed {
    private Group group;
    private Set<Post> posts;

    public Feed(Group group) {
        this.group = group;
        this.posts = new LinkedHashSet<>();
    }

    public Group getGroup() {
        return group;
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public Set<Post> getPosts() {
        return posts;
    }
}
