package com.blog.melnykblog.service;

import com.blog.melnykblog.dto.NewPostDto;

public interface BlogService {

    void saveNewBlog(NewPostDto blog);
}
