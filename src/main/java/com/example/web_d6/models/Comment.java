package com.example.web_d6.models;

public class Comment {

    private int postId;
    private String author;
    private String content;

    public Comment(int postId,String author, String content) {
        this.postId = postId;
        this.author = author;
        this.content = content;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "postId=" + postId +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
