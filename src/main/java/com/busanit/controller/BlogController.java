package com.busanit.controller;

import com.busanit.model.Blog;
import com.busanit.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/blog")
@RequiredArgsConstructor
public class BlogController {
    private final BlogService blogService;
    // http://localhost:8080/blog/list
    @GetMapping("/list")
    public String blogList(Model model) {
        List<Blog> list = blogService.blogList();
        model.addAttribute("list",list);

        return "/miniblog/blogList";
    }

    @GetMapping("/detail")
    public String blogDetail(String num, Model model) {
        Blog blog = blogService.blogDetail(num);
        model.addAttribute("detail", blog);

        return "/miniblog/blogDetail";
    }

    // http://localhost:8080/blog/reg
    @GetMapping("/reg")
    public String blogReg() {
        return "/miniblog/blogReg";
    }
    @PostMapping("/reg")
    public String blogReg(Blog blog) {
        blogService.blogReg(blog);

        return "redirect:/blog/list";
    }

    @GetMapping("/update")
    public String blogUpdate(String num, Model model) {
        Blog blog = blogService.blogDetail(num);
        model.addAttribute("detail",blog);

        return "/miniblog/blogUpdate";
    }
    @PostMapping("/update")
    public String blogUpdate(Blog blog) {
        blogService.blogUpdate(blog);

        return "redirect:/blog/detail?num=" + blog.getNum();
    }

    @GetMapping("/delete")
    public String blogDelete(String num) {
        blogService.blogDelete(num);

        return "redirect:/blog/list";
    }
}
