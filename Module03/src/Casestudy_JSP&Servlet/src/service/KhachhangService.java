package service;

import model.Khachhang;

import java.util.List;

public interface KhachhangService {
    List<Khachhang> finAll();
    void  save(Khachhang khachhang);
    List<Khachhang>  finByName(String name);
    Khachhang update(int id,  Khachhang khachhang);
    void remove(int id);
    Khachhang finById1(int id);
}
