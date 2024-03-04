package com.busanit.controller;

import com.busanit.model.Mem;
import com.busanit.service.MemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MemController{
    private final MemService memService;
    @GetMapping("/memList")
    public String memList(Model model) {
        List<Mem> list = memService.memList();
        model.addAttribute("list",list);
        return "memList";
    }

    @GetMapping("/memReg")
    public String memReg() {
        return "memReg";
    }

    @PostMapping("/memReg")
    public String memReg(Mem mem) {
        memService.memReg(mem);

        return "redirect:/memReg";
    }
}
