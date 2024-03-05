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

    @GetMapping("/memDetail")
    public String memDetail(String num, Model model) {
        Mem mem = memService.memDetail(num);
        model.addAttribute("detail", mem);

        return "memDetail";
    }

    @GetMapping("/memUpdate")
    public String memUpdate(String num, Model model) {
        Mem mem = memService.memDetail(num);
        model.addAttribute("detail", mem);

        return "memUpdate";
    }

    @PostMapping("/memUpdate")
    public String memUpdate(Mem mem) {
        memService.memUpdate(mem);

        return "redirect:/memDetail?num=" + mem.getNum();
    }

    @GetMapping("/memDelete")
    public String memDelete(String num) {
        memService.memDelete(num);

        return "redirect:/memList";   // 삭제 후 이동할 주소 호출
        // return "memList"  -- jsp 페이지
    }

}
