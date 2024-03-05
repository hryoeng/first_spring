package com.busanit.service;

import com.busanit.model.Blog;

import java.util.List;

public interface BlogService {
    public List<Blog> blogList();
    public Blog blogDetail(String num);
    public void blogReg(Blog blog);
    public void blogUpdate(Blog blog);
    public void blogDelete(String num);
}
