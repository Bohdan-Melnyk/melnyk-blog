package com.blog.melnykblog.service.impl;

import com.blog.melnykblog.dto.NewPostDto;
import com.blog.melnykblog.entity.Blog;
import com.blog.melnykblog.repo.BlogRepo;
import com.blog.melnykblog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class BlogServiceImpl implements BlogService {
    private final BlogRepo blogRepo;

    @Autowired
    public BlogServiceImpl(BlogRepo blogRepo) {
        this.blogRepo = blogRepo;
    }


    @Override
    public void saveNewBlog(NewPostDto dto) {
        var blog = new Blog();
        blog.setTitle(dto.getTitle());
        blog.setContent(dto.getContent());
        blog.setAuthorId(dto.getAuthorId());
        blog.setCreatedAt(LocalDate.now());
        blogRepo.insert(blog);
    }
}
