package com.biliaiev.DB_LMS_Diploma.domain;

import java.time.LocalDate;
import java.util.Objects;

public class Post implements PersistenceEntity {
    private Integer id;
    private String text;
    private LocalDate datePosted;
    private User author;

    public Post(String text, LocalDate datePosted, User author) {
        this.text = text;
        this.datePosted = datePosted;
        this.author = author;
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getText() {
        return text;
    }

    public boolean setText(String text) {
        this.text = text;
        return true;
    }

    public LocalDate getDatePosted() {
        return datePosted;
    }

    @Override
    public String toString() {
        return "Post{" +
                "text='" + text + '\'' +
                ", datePosted=" + datePosted +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return text.equals(post.text) &&
                datePosted.equals(post.datePosted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, datePosted);
    }
}
