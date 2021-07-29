package com.example.ql_khachhang.model.service.impl;

import com.example.ql_khachhang.model.entity.Khachhang;
import com.example.ql_khachhang.model.repository.KhachhangRepository;
import com.example.ql_khachhang.model.service.KhachhangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhachhangServicelmpl implements KhachhangService {

    @Autowired
    private KhachhangRepository khachhangRepository;

    @Override
    public List<Khachhang> findAll() {
        return khachhangRepository.findAll();
    }

    @Override
    public void save(Khachhang khachhang) {

        khachhangRepository.save(khachhang);
    }

    @Override
    public void remove(Khachhang khachhang) {
        khachhangRepository.delete(khachhang);

    }

    @Override
    public Khachhang update(Integer id, Khachhang khachhang) {
        return null;
    }

    @Override
    public Khachhang finById(Integer id) {
        return khachhangRepository.findById(id).orElse(null);
    }
}
