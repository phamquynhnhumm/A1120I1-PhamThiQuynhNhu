package com.example.casestudy_spring.model.service;

import com.example.casestudy_spring.model.entity.taikhoan.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    Page<User> findAll(Pageable pageable);

    void save(User user);

    void remove(User user);

    Integer dangnhap(String tenUser, String matkhau);

    User findById(String tenUser);

    Page<User> findByNameContaining(String tenUser, Pageable pageable);
}

