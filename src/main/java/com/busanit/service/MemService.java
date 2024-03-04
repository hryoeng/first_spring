package com.busanit.service;

import com.busanit.model.Mem;

import java.util.List;

public interface MemService {
    // 조회
    public List<Mem> memList();
    // 등록
    public void memReg(Mem mem);
}
