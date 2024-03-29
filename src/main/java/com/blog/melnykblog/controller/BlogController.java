package com.blog.melnykblog.controller;

import com.blog.melnykblog.dto.NewPostDto;
import com.blog.melnykblog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blog")
public class BlogController {

    private final BlogService blogService;

    @Autowired
    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @PostMapping("/new")
    public String createNewPost(@RequestBody NewPostDto newPostDto) {
        blogService.saveNewBlog(newPostDto);
        return "Blog added successfully.";
    }
}
