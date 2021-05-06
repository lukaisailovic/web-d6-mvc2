package com.example.web_d6.models;

import java.util.Date;

public class Post {
    private int id = 0;
    private final String author;
    private final String title;
    private final String content;
    private final Date createdAt;

    public Post(String author, String title, String content) {
        this.author = author;
        this.title = title;
        this.content = content;
        this.createdAt = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getTruncatedContent(){
        int end = 150;
        if (this.content.length() < end){
            end = this.content.length();
        }
        return this.content.substring(0,end);
    }

    public String getContent() {
        return content;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
