package com.busanit.service;

import com.busanit.model.Board;

public interface BoardService {

    // 게시글 등록
    public void register(Board board);
    // service에서는 실제 사용할 메서드를 정의만 함
}
