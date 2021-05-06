package com.example.web_d6.repositories.comment;

import com.example.web_d6.models.Comment;
import com.example.web_d6.models.Post;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CommentRepository implements ICommentRepository{

    private static final Map<Integer, List<Comment>> comments = new ConcurrentHashMap<>();



    @Override
    public List<Comment> findByPost(Post post) {
        return comments.get(post.getId());
    }

    @Override
    public synchronized void save(Post post, Comment comment) {
        ArrayList<Comment> commentsForPost = new ArrayList<>();
        if (comments.containsKey(post.getId())){
            commentsForPost = (ArrayList<Comment>) comments.get(post.getId());
        }
        commentsForPost.add(comment);
        comments.put(post.getId(),commentsForPost);
        System.out.println("SAVED COMMENT");
        System.out.println(comment);
        System.out.println(post);

    }
}
