package com.blog.melnykblog.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Objects;

@Document(collection = "blog")
public class Blog {
    @Id
    private String id;
    private Long authorId;
    private String title;
    private String content;
    private boolean approved;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Blog blog = (Blog) o;
        return approved == blog.approved
                && Objects.equals(id, blog.id)
                && Objects.equals(authorId, blog.authorId)
                && Objects.equals(title, blog.title)
                && Objects.equals(content, blog.content)
                && Objects.equals(createdAt, blog.createdAt)
                && Objects.equals(updatedAt, blog.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, authorId, title, content, approved, createdAt, updatedAt);
    }
}
