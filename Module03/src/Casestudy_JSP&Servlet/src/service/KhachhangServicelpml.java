package service;

import model.Khachhang;
import repository.KhachhangRepository;
import repository.KhachhangRepositorylmpl;

import java.util.List;

public class KhachhangServicelpml implements  KhachhangService {
    KhachhangRepository khachhangRepository = new KhachhangRepositorylmpl();
    @Override
    public List<Khachhang> finAll() {
        return khachhangRepository.finAll();
    }

    @Override
    public void save(Khachhang khachhang) {
        khachhangRepository.save(khachhang);

    }

    @Override
    public List<Khachhang> finByName(String name) {
        return khachhangRepository.finByName(name);
    }

    @Override
    public Khachhang update(int id, Khachhang khachhang) {
        return khachhangRepository.update(id,khachhang);
    }

    @Override
    public void remove(int id) {
        khachhangRepository.remove(id);

    }

    @Override
    public Khachhang finById1(int id) {
        return khachhangRepository.finById1(id);
    }
}
