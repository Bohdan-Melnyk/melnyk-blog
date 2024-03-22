package com.blog.melnykblog.controller;

import com.blog.melnykblog.dto.NewPostDto;
import com.blog.melnykblog.entity.Blog;
import com.blog.melnykblog.repo.BlogRepo;
import com.blog.melnykblog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/blog")
public class BlogController {

    private final BlogRepo blogRepo;

    private final BlogService blogService;

    @Autowired
    public BlogController(BlogRepo blogRepo, BlogService blogService) {
        this.blogRepo = blogRepo;
        this.blogService = blogService;
    }

    @PostMapping("/new")
    public String createNewPost(@RequestBody NewPostDto newPostDto) {
        blogService.saveNewBlog(newPostDto);
        return "Blog added successfully.";
    }
    @GetMapping
    public String getPost() {
        return "Success";
    }

    @GetMapping("/posts")
    public ResponseEntity<List<Blog>> getAllPosts() {
        return ResponseEntity.ok().body(blogRepo.findAll());
    }
}
