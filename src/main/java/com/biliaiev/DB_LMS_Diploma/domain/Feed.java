package com.biliaiev.DB_LMS_Diploma.domain;

import java.util.LinkedList;
import java.util.List;

public class Feed implements IPersistenceEntity {
    private Integer id;
    private Group group;
    private List<Post> posts;

    public Feed(Group group) {
        this.group = group;
        this.posts = new LinkedList<>();
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public Group getGroup() {
        return group;
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public List<Post> getPosts() {
        return posts;
    }
}
