package com.busanit.service;

import com.busanit.model.Mem;

import java.util.List;

public interface MemService {
    // 조회
    public List<Mem> memList();
    // 등록
    public void memReg(Mem mem);
    // 상세보기
    public Mem memDetail(String num);
    // 수정
    public void memUpdate(Mem mem);
    // 삭제
    public void memDelete(String num);
}
