package com.example.web_d6.repositories.comment;

import com.example.web_d6.models.Comment;
import com.example.web_d6.models.Post;


import java.util.List;

public interface ICommentRepository {


    List<Comment> findByPost(Post post);

    void save(Post post,Comment comment);
}

