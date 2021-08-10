package com.example.demsoluotview.model.repository;

import com.example.demsoluotview.model.entity.Khachhang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KhachhangRepository extends JpaRepository<Khachhang, Integer> {

    Page<Khachhang> findAllByTenContaining(String name, Pageable pageable);


}
