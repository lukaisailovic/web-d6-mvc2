package com.example.web_d6.repositories.post;


import com.example.web_d6.models.Post;

import java.util.List;

public interface IPostRepository  {

    List<Post> all();

    Post find(int id);

    void save(Post post);
}
