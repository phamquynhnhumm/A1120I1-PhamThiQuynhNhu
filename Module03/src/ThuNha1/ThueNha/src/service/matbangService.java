package service;

import model.Matbang;

import java.util.List;

public interface matbangService {
    List<Matbang> finAll();
    void save ( Matbang matbang);
    List<Matbang> finByLoai(String loai);
    List<Matbang> finByTang(String tang);
    List<Matbang> finByGia(Float gia);
    Matbang update ( String id, Matbang matbang);
    void remove(String id);
    Matbang finById(String id);
    boolean finByIdTrung( String id);
}
