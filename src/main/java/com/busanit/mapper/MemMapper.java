package com.busanit.mapper;

import com.busanit.model.Mem;

import java.util.List;

public interface MemMapper {
    public List<Mem> selectList();
    public void insert(Mem mem);
}
