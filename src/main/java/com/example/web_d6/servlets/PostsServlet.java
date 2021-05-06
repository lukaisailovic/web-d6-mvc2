package com.example.web_d6.servlets;

import com.example.web_d6.repositories.post.IPostRepository;
import com.example.web_d6.repositories.post.PostRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "postsServlet", value = "/posts")
public class PostsServlet extends HttpServlet {


    private IPostRepository postRepository;

    @Override
    public void init() throws ServletException {
        this.postRepository = new PostRepository();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("posts",this.postRepository.all());
        req.getRequestDispatcher("posts.jsp").forward(req,resp);
    }
}
