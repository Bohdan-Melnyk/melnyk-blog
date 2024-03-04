package com.blog.melnykblog.service;

import com.blog.melnykblog.dto.NewBlogDto;

public interface BlogService {

    void saveNewBlog(NewBlogDto blog);
}
