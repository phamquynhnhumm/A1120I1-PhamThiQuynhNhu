package repository;

import model.Khachhang;
import model.User;

import java.util.List;

public interface KhachhangRepository {
    List<Khachhang> finAll();
    void  save(Khachhang khachhang);
    List<Khachhang>  finByName(String name);
    Khachhang update(int id,  Khachhang khachhang);
    void remove(int id);
    Khachhang finById1(int id);
}
