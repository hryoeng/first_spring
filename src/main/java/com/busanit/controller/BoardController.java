package com.busanit.controller;


import com.busanit.model.Board;
import com.busanit.model.Mem;
import com.busanit.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class BoardController {

    // 생성자 주입 방식
    private final BoardService boardService;

    // 필드 주입 방식
//    @Autowired
//    private BoardService boardService;

    @RequestMapping("/boardList.do")
    public String boardList(Model model) {

        System.out.println("boardList.do 실행");

        Board vo = new Board();
        vo.setIdx(1);
        vo.setTitle("제목");
        vo.setContent("내용");
        vo.setWriter("작성자");
        vo.setIndate("2024-03-04");
        vo.setCount(0);

        List<Board> list = new ArrayList<>();
        list.add(vo);
        list.add(vo);
        list.add(vo);

        model.addAttribute("list",list);

        return "boardList";
    }

    public void register(Board board) {
        // 기존 방식
//        BoardService boardService = new BoardService();
        boardService.register(board);

    }
}
