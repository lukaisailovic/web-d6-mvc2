package com.example.web_d6.repositories.post;


import com.example.web_d6.models.Post;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class PostRepository implements IPostRepository{

    private static final Map<Integer, Post> posts = new ConcurrentHashMap<>();
    private static final AtomicInteger counter = new AtomicInteger(1);

    @Override
    public List<Post> all() {
        return new ArrayList<>(posts.values());
    }

    @Override
    public Post find(int id) {
        return posts.get(id);
    }

    @Override
    public synchronized void save(Post post) {
        int id = counter.getAndIncrement();
        post.setId(id);
        posts.put(id,post);
    }


}
