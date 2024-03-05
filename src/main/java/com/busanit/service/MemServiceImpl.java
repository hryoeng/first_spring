package com.busanit.service;

import com.busanit.mapper.MemMapper;
import com.busanit.model.Mem;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemServiceImpl implements MemService{
    private final MemMapper memMapper;

    @Override
    public List<Mem> memList() {
        return memMapper.selectList();
    }
    @Override
    public void memReg(Mem mem) {
        memMapper.insert(mem);
    }
    @Override
    public Mem memDetail(String num) {
        return memMapper.detail(num);
    }
    public void memUpdate(Mem mem) {
        memMapper.update(mem);
    }
    public void memDelete(String num) {
        memMapper.delete(num);
    }
}
