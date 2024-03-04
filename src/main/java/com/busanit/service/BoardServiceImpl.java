package com.busanit.service;

import com.busanit.mapper.MemMapper;
import com.busanit.model.Board;
import com.busanit.model.Mem;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{
    // 메서드 실제 구현
    @Override
    public void register(Board board) {
        System.out.println("게시글 등록 구현부");
    }
}
