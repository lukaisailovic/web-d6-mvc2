package com.example.web_d6.repositories.post;


import com.example.web_d6.models.Post;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PostRepository implements IPostRepository{

    private static final Map<Integer, Post> posts = new ConcurrentHashMap<>();

    @Override
    public List<Post> all() {
        return null;
    }

    @Override
    public Post find(int id) {
        return null;
    }

    @Override
    public void save(Post post) {

    }


}
