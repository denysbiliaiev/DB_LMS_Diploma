package com.biliaiev.DB_LMS_Diploma.domain;

import java.time.LocalDate;
import java.util.Objects;

public class Post {
    String text;
    LocalDate datePosted;

    public Post(String text, LocalDate datePosted) {
        this.text = text;
        this.datePosted = datePosted;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
