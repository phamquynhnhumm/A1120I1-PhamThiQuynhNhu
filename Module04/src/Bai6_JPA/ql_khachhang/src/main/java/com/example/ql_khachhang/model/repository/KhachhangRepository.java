package com.example.ql_khachhang.model.repository;

import com.example.ql_khachhang.model.entity.Khachhang;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KhachhangRepository extends JpaRepository<Khachhang, Integer> {
    List<Khachhang> findAll();
//    List<Khachhang>
}
