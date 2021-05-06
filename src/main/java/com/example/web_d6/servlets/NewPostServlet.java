package com.example.web_d6.servlets;

import com.example.web_d6.models.Post;
import com.example.web_d6.repositories.post.IPostRepository;
import com.example.web_d6.repositories.post.PostRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "newPostsServlet", value = "/new-post")
public class NewPostServlet extends HttpServlet {

    private IPostRepository postRepository;

    @Override
    public void init() throws ServletException {
        this.postRepository = new PostRepository();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("new-post.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Post post = new Post(req.getParameter("author"),req.getParameter("title"),req.getParameter("content"));
        this.postRepository.save(post);
        System.out.println("Post: "+post);
        resp.sendRedirect(req.getContextPath() + "/posts");
    }
}
