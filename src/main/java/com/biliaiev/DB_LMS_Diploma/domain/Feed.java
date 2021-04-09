package com.biliaiev.DB_LMS_Diploma.domain;

import java.util.LinkedList;
import java.util.List;

public class Feed implements PersistenceEntity {
    private Integer id;
    private Group group;
    private List<Post> posts;

    public Feed(Group group) {
        this.group = group;
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public Group getGroup() {
        return group;
    }

    public boolean addPost(Post post) {
        if (posts == null) {
            posts = new LinkedList<>();
        }

        return posts.add(post);
    }

    public List<Post> getPosts() {
        return posts;
    }
}
