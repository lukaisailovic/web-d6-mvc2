package com.example.web_d6.servlets;


import com.example.web_d6.models.Comment;
import com.example.web_d6.models.Post;
import com.example.web_d6.repositories.comment.CommentRepository;
import com.example.web_d6.repositories.comment.ICommentRepository;
import com.example.web_d6.repositories.post.IPostRepository;
import com.example.web_d6.repositories.post.PostRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "postServlet", value = "/post/*")
public class PostServlet extends HttpServlet {

    private IPostRepository postRepository;
    private ICommentRepository commentRepository;


    @Override
    public void init() throws ServletException {
        this.postRepository = new PostRepository();
        this.commentRepository = new CommentRepository();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getPathInfo().substring(1));
        Post post = this.postRepository.find(id);
        req.setAttribute("post", post);
        req.setAttribute("comments",this.commentRepository.findByPost(post));
        System.out.println(post);
        req.getRequestDispatcher("/post.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getPathInfo().substring(1));
        Post post = this.postRepository.find(id);
        Comment comment = new Comment(post.getId(),req.getParameter("author"),req.getParameter("content"));
        this.commentRepository.save(post,comment);
        resp.sendRedirect(req.getContextPath() + "/post/"+id);
    }
}

