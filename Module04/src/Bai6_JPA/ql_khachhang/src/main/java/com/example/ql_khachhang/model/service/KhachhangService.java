package com.example.ql_khachhang.model.service;

import com.example.ql_khachhang.model.entity.Khachhang;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface KhachhangService {
    List<Khachhang> findAll();
    void save(Khachhang khachhang);
    void remove(Khachhang khachhang);
    Khachhang update(Integer id, Khachhang khachhang);
    Khachhang finById(Integer id);

}
