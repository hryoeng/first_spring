package com.busanit.mapper;

import com.busanit.model.Blog;

import java.util.List;

public interface BlogMapper {
    public List<Blog> list();
    public Blog detail(String num);
    public void reg(Blog blog);
    public void update(Blog blog);
    public void delete(String num);
}
