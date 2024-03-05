package com.busanit.service;

import com.busanit.mapper.BlogMapper;
import com.busanit.model.Blog;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BlogServiceImpl implements BlogService{
    private final BlogMapper blogMapper;
    @Override
    public List<Blog> blogList() {
        return blogMapper.list();
    }

    public Blog blogDetail(String num) {
        return blogMapper.detail(num);
    }

    public void blogReg(Blog blog) {
        blogMapper.reg(blog);
    }

    public void blogUpdate(Blog blog) {
        blogMapper.update(blog);
    }

    public void blogDelete(String num) {
        blogMapper.delete(num);
    }
}
